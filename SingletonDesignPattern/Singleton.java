public class Singleton {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Singleton singleton =  Singleton.getInstance();
        System.out.println(singleton.hashCode());
        Singleton singleton2 =  Singleton.getInstance();
        System.out.println(singleton2.hashCode());
        Singleton singleton3 =  Singleton.getInstance2();
        System.out.println(singleton3.hashCode());
        Singleton singleton4 =  Singleton.getInstance2();
        System.out.println(singleton4.hashCode());
    }


    // method 1 of creating singleton
    // private static class variable
    // private constructor
    // public static method to get the instance ... if instance is null, create a new instance
    private Singleton() {
        System.out.println("Singleton is created");
    }

    private static Singleton instance = null;


    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    ///method 2 of creating singleton
    // as above method is not thred safe so it can create 2 or more object by multiple threads
    // so we can use eager initialization by creating instance at the time of class loading and not runtime
    // private static Singleton instance = new Singleton();
    // public static Singleton getInstance() {
    //     return instance;

    private static Singleton instance2 = new Singleton();
    public static Singleton getInstance2() {
        return instance2;
    }

    //method 3 of creating singleton

    //method 2 is thred safe but method 1 is not thred safe but it is not good for memory management as it creates instance at runtime
    // also we cannot pass arguments to constructor in method 2
    // private static Singleton instance = new Singleton(10);

}
