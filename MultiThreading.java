class BankAccount {
    private int balance = 100;

    // The 'synchronized' keyword ensures only one thread can enter this method at a time
    public synchronized void withdraw(String name, int amount) {
        System.out.println(name + " is checking the balance. Current balance: $" + balance);
        
        if (balance >= amount) {
            System.out.println(name + " is about to withdraw $" + amount);
            try {
                // Simulating a small delay in processing
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            balance -= amount;
            System.out.println(name + " successfully withdrew $" + amount + ". Remaining balance: $" + balance);
        } else {
            System.out.println("Sorry " + name + ", insufficient funds for a $" + amount + " withdrawal.");
        }
        System.out.println("---------------------------------------------------------");
    }
}

// Implementing Runnable to define the task
class WithdrawalTask implements Runnable {
    private final BankAccount account;
    private final String personName;
    private final int amountToWithdraw;

    public WithdrawalTask(BankAccount account, String personName, int amountToWithdraw) {
        this.account = account;
        this.personName = personName;
        this.amountToWithdraw = amountToWithdraw;
    }

    @Override
    public void run() {
        // The thread executes this task
        account.withdraw(personName, amountToWithdraw);
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        // One shared resource
        BankAccount sharedAccount = new BankAccount();

        // Two separate tasks sharing the same account resource
        Runnable task1 = new WithdrawalTask(sharedAccount, "Alex", 70);
        Runnable task2 = new WithdrawalTask(sharedAccount, "Bob", 50);

        // Creating the threads (workers)
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Starting both threads at roughly the same time
        thread1.start();
        thread2.start();
    }
}
