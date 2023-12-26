public class Client {
    public static void main(String[] args) {


        //practical factory
        Car car1 = CarFactory.getCarObject("Tata");
        System.out.println(car1.printCar());


        Car car2 = CarFactory.getCarObject("Toyato");
        System.out.println(car2.printCar());


        //factory method

        Car car3 = new Tata();
        CarEngine engine = car3.getEngine();
        System.out.println(engine.printEngine());


        Car car4 = new Toyato();
        CarEngine engine2 = car4.getEngine();
        System.out.println(engine2.printEngine());
    }
}
