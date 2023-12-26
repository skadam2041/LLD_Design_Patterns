public class Client {
    public static void main(String[] args) {
        Car car1 = CarFactory.getCarObject("Tata");
        System.out.println(car1.printCar());


        Car car2 = CarFactory.getCarObject("Toyato");
        System.out.println(car2.printCar());
    }
}
