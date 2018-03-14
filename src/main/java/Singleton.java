public class Singleton {
    private static Singleton singleton;

    private Singleton() {
        // Do nothing
    }

    private static synchronized void createInstanceIfNeeded() {
        if (singleton == null) {
            singleton = new Singleton();
            System.out.println("Instance created");
        }
    }


    public static Singleton getInstance() {
        createInstanceIfNeeded();
        System.out.println("Returning instance");
        return singleton;
    }

    public void sayHello(){
        System.out.println("Hello");
    }
}
