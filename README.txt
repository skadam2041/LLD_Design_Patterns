#Singleton :
   When we want to have only 1 object of specific class , we can use Singleton design pattern 
   to create singleton class we need static variable of singleton class , private constructor and public static method 
   e.g
     private static Singleton instance = null;
     private Singleton(){}
     public static getObject(){
       if(instance == null){
         instance = new Singleton();
       }
       return instance;
     }

  Above method is not thread safe , it can end up creating multiple object is more thread went into critical section at same time
  we can use eager initialization to make it thread safe 

  e.g
     private static Singleton instance = new Singleton();
     private Singleton(){}
     public static getObject(){
       return instance;
     }

  Above method is thread safe but it can increase app start/up time

  we can use double checking lock method to create threadsafe and optimized creation 
  e.g
     private static Singleton instance = null;
     private Singleton(){}
     public static getObject(){
       if(instance == null){
         lock.lock();
         if(instance == null){
           instance = new Singleton();
         }
         lock.unlock();
       }
       return instance;
     }

     

     
  
     
