import singleton.Singleton;

public class Main {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.name = "Test";
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton1.name);
    }
}