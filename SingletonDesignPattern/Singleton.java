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
        Singleton singleton5 =  Singleton.getInstance3();
        System.out.println(singleton5.hashCode());
        Singleton singleton6 =  Singleton.getInstance3();
        System.out.println(singleton6.hashCode());
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
    // so we can use method 3 which is thred safe and also good for memory management
    // we can use synchronized keyword to make it thred safe
    // but it is not good for performance as it will create lock on method

     private static Singleton instance3 = null;
     public synchronized static Singleton getInstance3() {
         if (instance3 == null) {
             instance3 = new Singleton();
         }
         return instance3;
     }

     // we can also use double checked locking to make it thred safe and also good for performance
    // but it can create 2 or more object by multiple threads
    //so we can use double checked locking
      private static Singleton instance4  = null;
      public static Singleton getInstance4() {

              if (instance3 == null) {
                  synchronized (Singleton.class) {
                      if (instance3 == null) {
                          instance3 = new Singleton();
                      }
                  }
              }
          return instance3;
     //
}
