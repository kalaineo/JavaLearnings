class SingletonOne {

    private static volatile Singleton instance;

    private Singleton() {
        System.out.println("Singleton instance created successfully");
    }

    public static SingletonOne getInstance() {
        if(instance == null) {
            synchronized (SingletonOne.class) {
                if ( instance == null) {
                    instance = new SingletonOne();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello world from singleton");
    }

}

public class SingletonEx {
    public static void main(String args[]) {

        SingletonOne object1 = Singleton.getInstance();
        object1.showMessage();

        // Try to get another object
        SingletonOne object2 = Singleton.getInstance();
        
        // Check if they are the exact same instance
        System.out.println("Are both objects the same? " + (object1 == object2));
    }
}
