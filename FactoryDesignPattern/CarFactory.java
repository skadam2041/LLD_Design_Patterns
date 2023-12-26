public class CarFactory {
    public static Car  getCarObject(String input) {
        if(input.equals("Tata")) {
            return new Tata();
        } else if(input.equals("Toyato")) {
            return new Toyato();
        } else {
            return new Car();
        }

    }
}
