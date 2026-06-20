class RunnableImpl implements Runnable {
    public void run() {
        System.out.println("Thread running...");
    }
}

class RunnableExample {
    public static void main(String args[]) {
        RunnableImpl runImpl = new RunnableImpl();
        Thread trd = new Thread(runImpl);
        trd.run();
    }
}