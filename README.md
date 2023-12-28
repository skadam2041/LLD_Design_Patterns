**Creational design pattern**

**#Singleton** :

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

**#Factory** :

   When we want to create a specific object of subclass of specific parent class based on some condition or requirement , we can use Factory design pattern
   
   ##Practical factory :
   
   We can create a Factory Class and write our static getSpecificobject(condition) method in it and from client we can call this static method to get our object 
      
   e.g :
   
         class carFactory{
            private static Car getObjectOfCar(String input){
               if(input == "tata") return new Tata()
               if(input == "toyato:) return new Toyato()
            }
         }

   ##Factory method : 
   
   Instead of creating seperate Factory class we can add create method in each subclass tot create object of corrosponding subclass
   here Tata class will create TataEngine object of CarEngine Type
      
   e.g
      
         class Tata extends Car{
            //Attributes , gttter and setter of class
            public CarEngine getEngine(){
               return new TataEngine();
            }
         }

   ##Abstract factory :
   
   When we have to create multiple objects corrosponding to that class like factoty method then we can move all those methods to seperate interface/abstract class  
   and we can create subclass of components of parent class
      
   If Tata has object creation logic of createEngine, createTyre , createWindow we can create Seperate interface for Creating those components like Components factory 
   (Car and Components will have there own inheritance relation)
      
   e.g
      
         class Tata extends Car{
            //Attributes , gttter and setter of class
            //It will have attribute of componentfactory type
            public ComponentFactory getComponentFacyory(){
               return new CreateCommponentTataFactory();
            }
         }
         ----------------------
         interface CreateComponentFactory{
            CarEngine createEngine();
            CarWindow createWindow();
         }

         class  CreateCommponentTataFactory implemets CreateComponentFactory {
            TataEngine createEngine(){
               return new TataEngine();
            }
            TataWindow createWindow(){
               return new TataWindow();
            }
         }
         //similarly other subclasses like toyato will have it's own component creation factory

         Class Client{
            Car car = new Tata();
            CarEngine carEngine = car.getComponentFacyory().createEngine();
         }

**#Builder** : 

   When we need to create complex immutable objects of with lots of attributes and need to validate some attributes before classs creation 
   then we can use Builder design pattern to build object of specific class with required arguments
   
   Builder class will be copy of our immutable class with getter and setter which returns Builder class object 
   
   we can set required parameters and do method chaining  e.g Builder.setName("name").setAge(45).setAddress().validate().build();
   
   the build object of builder class will validate values first then calls constructor of our immutable class and set required values in constructor and will return our requuired object
   
   e.g :
   
      public class Student {
          private String name;
          private int age;
          private String address;
          private Student(Builder builder){
              this.name = builder.getName();
              this.age = builder.getAge();
              this.address = builder.getAddress();
          }

          public static Builder getBuilder() {
              return new Builder();
          }

          public String toString(){
              return "Name: " + this.name + "\nAge: " + this.age + "\nAddress: " + this.address;
          }


          public static class Builder {
              private String name;
              private int age;
              private String address;

              public String getName() {
                  return name;
              }

              public int getAge() {
                  return age;
              }

              public String getAddress() {
                  return address;
              }
              public Builder setName(String name) {
                  this.name = name;
                  return this;
              }
              public Builder setAge(int age) {
                  this.age = age;
                  return this;
              }
              public Builder setAddress(String address) {
                  this.address = address;
                  return this;
              }

              public Student build() {
                  if (!validate()) {
                      throw new IllegalArgumentException("Invalid student");
                  }
                  return new Student(this);
              }

              public boolean validate() {
                  if (this.name == null || this.name.isEmpty()) {
                      return false;
                  }
                  if (this.age < 0 || this.age > 100) {
                      return false;
                  }
                  if (this.address == null || this.address.isEmpty()) {
                      return false;
                  }
                  return true;
              }
          }
      }


**#Prototype and Registry** :

   When a object is required to create multiple times with only mimimum changes , we can save the object in registry/hashMap and clone it whenever required and do minimum settings and use it
   here we can use prototype(clone) and registry(map) design pattern
   
   for e.g if want to create a student for specific batch , batch name , classes , instructor will be same for them , few minimum chnages can be name and number 
   so we can create a prototype of that student class and clone it to get new object with already set comman parameters and then add required changes to that object 
 
   ##Cloning the object : we can use copy constructor and clone method
   
   1] Fetch object from registry
   
   Student studentCopy = registry.getStudent("AUG");
   
   2] call clone method for that 
   
   Student student1 = studentCopy.copy();
   
   3] copy methos will create object by calling copy constructor of that class by passing current object
   
   return new Student(this);
   
   4] copy constructor will set attributes/parameters and then return new object 
   
   5] In case of inheritance relation we need to call super to set parent paramters/attributes

   e.g

      public class Student {
          private String name;
          private int age;
          private String address;

          private String batch;

          public Student(Student student) {
              this.name = student.name;
              this.age = student.age;
              this.address = student.address;
              this.batch = student.batch;
          }

          public Student(String batch) {
              this.batch = batch;
          }

          public Student clone() {
              return new Student(this);
          }
      }

      public class IntellegentStudent extends Student {
         private int psp;

          public IntellegentStudent(IntellegentStudent student) {
              super(student);
              this.psp = student.psp;
          }
          public IntellegentStudent copy() {
              return new IntellegentStudent(this);
          }
      }


------------------------------------------------------------------------------------------------------------------------------------------------------

**Structural design pattern**

**#Adapter**:

   When our code base is using  differnt third party services then we can use Adapter design pattern using dependency inversion principle and then structure our code base 

   We need to create adapter for each of 3rd party dependency and implement same method in it by making contact with parent Innterface and then adapter will internally call 3rd party functions

   e.g 

      Interface Adapter{
         makePayment();
      }

      class phonepayAdapter implements Adapter{
         makePayment(){
            payViaPhonePay(){
               //Third party functionss
            }
         }
      }

      class gpayAdapter implements Adapter{
         makePayment(){
            payViaGPay(){
               //Third party functionss
            }
         }
      }

      Client{
         Adapter payClient = new gpayAdapter();
         payclinet.makePaymant();
         //if inn future we need to nake chaneges only change the object with phonepay
      }


**#Facade** :

   When our clinet code stucture is becoming to complex beacause of lots of dependencies,  then we can move this logic into another class and then just call methods from client class.
   this is Facade design patterb
   
   e.g :
   
      public class PaymentGatewayFacade {
         private  GeneratePaymentLink generatePaymentLink = new GeneratePaymentLink();
          private StorePayment storePayment = new StorePayment();

          public String makePayment(String productName) {
              String str = generatePaymentLink.generatePaymentLink(productName);
              str += "\n" + storePayment.storePayment(productName);
              return str;
          }
      }  

   In above method we moved the logic of make payment which is dependent on 2 dependecies moved to facade so now client class can only call makepayment methos 

**#Decorator** :

   When we want to create an object of something incrementally from base class we can use decorator design pattern.

   In this we need a Universal Interface with required methods which is implemented by all of base and addon components and those component will receive Interface type adddon object in there constructor as shown below

   e.g :

      Interface Icecream {
         int getPrice();
         int getDesc();
      }

      Class Chocolate implements Icecream{
         Icecream icecream ;
         public Chocolate( Icecream icecream){
             this.icecream  = icecream
         }

         getPrice(){
             return icecream.getPrice() + 10;
         }

         getDesc(){
             return icecream.getDesc() + "choco";
         }   
      }

   With above code we can pass the Icecream object as base in chocolate(addon)

   We need to also make some base on which we can add addons

   e.g

      public class Cone  implements  IceCream{
         private IceCream iceCream;

         public Cone(){

         }
         public Cone(IceCream iceCream){
            this.iceCream = iceCream;
         }

         @Override
         public int getPrice() {
            if(iceCream == null) return  10;
            else return iceCream.getPrice() + 10;
         }

          @Override
          public String getDescription() {
               if(iceCream == null) return " cone ";
              else return iceCream.getDescription() + " cone ";
          }
      }

   using above code we can create base object without any Icecream dependency also we can later add it as addons 
   we can pass then base object to addon object constuctors to achieve this pattern
   
   e.g : IceCream iceCream2 = new Chocolate(new Strawberry(new Cone(new Chocolate(new Cone()))));
   
   we can get final price and desc from final object of icecream
   
   e.g : iceCream2.getPrice());
         iceCream2.getDescription());

**#Flyweight** :

 Some times our object has too many atttributes and some of them can be inteinsic(remains constant) and some are extrinsic(changes wrt to state) , In such cases when we have to create millions of object like    
 bullet in games which will consume a lot of memory , we can devide those intrinsic and extrinsic attributes in two different classes and extrinsic class object will have refrence of that intrinsic object 
 so that it will decreasse overall memory usage by that object

 e.g

   //intrinsic 
   
    public class Bullet {
       private int speed;
       private String name;
       private int damage;
       private byte[] image;
       private  String color;
    }

   //extrinsic

    public class FlyingBullet {
       private String direction;
       private int x;
       private int y;
       private Bullet bullet;
    }

   Flying bullet object has reference of bullet object

--------------------------------------------------------------------------------------------------------------------------------------------------------------

**behavioural design patterns**

**#Strategy** :

   When we want to implement different behaviours of same functionality then we can devide them in seperate class implentating a common startegy inferface with the functionality/method and call the required behaviour based on some condtion /input using factory pattern

   e.g : 

      public interface PathCalculatorStrategy {
       public String calculatePath();
      }

      public class BikePathCalculator implements PathCalculatorStrategy{
       @Override
       public String calculatePath() {
           return "Bike path";
       }   
      }

      public class CarPathCalculator implements PathCalculatorStrategy{
       @Override
       public String calculatePath() {
        return "Car path";
       }
      }

      public class PathCalculatorFactory {
       public static PathCalculatorStrategy getPathCalculator(String type) {
        if (type.equals("bike")) {
            return new BikePathCalculator();
         } else if (type.equals("car")) {
            return new CarPathCalculator();
         } else if (type.equals("walk")) {
            return new WalkPathCalculator();
         } else {
            return null;
         }
       }
      }

   we can call requied behaviour using factory 

   e.g PathCalculatorFactory.getPathCalculator("bike").calculatePath();

   
**#Observer** :

 When we have decide and call lots of dependent object at runtime , we can use observer design pattern

 When a order is placed , we need to notify generateInvoice ,  vendorservice , transport service and also we need have control over connsumers at runtime 

 for such cases we can have Universal Interface with notify method , and all required service will implement it 

 so in client class we can store all subscibed services in list<consumerInterface> and using for loop , we can call notify method on each of them. we can add functionality like subscribe and unsubscribe for consumers

 e.g :

    public interface Consumer {
       String getNofification(String message);
    }

    public class PaymentService implements Consumer{
       @Override
       public String getNofification(String message) {
           return "PaymentService: " + message;
       }
    }

    nofify service:

    List<Consumer> consumers= new ArrayList<>();

    public void sendNotification(String message){
        for(Consumer consumer: consumers){
            System.out.println(consumer.getNofification(message));
        }
    }

    public void addConsumer(Consumer consumer){
        consumers.add(consumer);
    }

    public void removeConsumer(int index){
        consumers.remove(index);
    }

    


 
    


 
 
   
      
         

   

      
   

      

      
   
   
   

   
   

         




      
     

     
  
     
