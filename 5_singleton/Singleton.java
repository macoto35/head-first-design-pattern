
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
            System.out.println("Create Singleton object!");
        } else {
            System.out.println("just return it!");
        }
        return uniqueInstance;
    }
}