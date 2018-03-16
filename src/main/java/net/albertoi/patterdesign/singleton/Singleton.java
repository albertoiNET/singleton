package net.albertoi.patterdesign.singleton;

public class Singleton {
    private static Singleton singleton;

    private Singleton() {
        // Do nothing
    }

    /**
     * Create instance only when is necessary
     */
    private static synchronized void createInstanceIfNeeded() {
        if (singleton == null) {
            singleton = new Singleton();
            System.out.println("Instance created");
        }
    }


    /**
     * Return always the same instance
     *
     * @return An unique instance of Singleton
     */
    public static Singleton getInstance() {
        createInstanceIfNeeded();
        System.out.println("Returning instance");
        return singleton;
    }

    /**
     * Dummy method
     */
    public void sayHello() {
        System.out.println("Hello");
    }
}
