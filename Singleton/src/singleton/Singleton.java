package singleton;

public class Singleton {

    // Lazy Singleton
    private static Singleton singleton;

    /*
     * Eager Singleton
     * private static Singleton singleton = new Singleton()
     * and remove null check from getInstace
     * */

    /*
     * Double check sigleton used to make singleton thread safe without using synchronized keyword
     * 1- make singleton reference volatile
     * 2- double check null
     * second check will be inside  synchronized(Singleton.class){} method
     * */
    public String name = "";

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        // synchronized will make singleton thread safe
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }
}
