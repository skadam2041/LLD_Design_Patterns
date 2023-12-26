public class Tata  extends Car{
    public String printCar() {
        return "Tata";
    }

    public CarEngine getEngine() {
        return new TataEngine();
    }
}
