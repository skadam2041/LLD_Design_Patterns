
import PathCalculatorStrategy.PathCalculatorFactory;

public class GoogleMap {

    public static void main(String[] args) {
        System.out.println("Google Map");
        System.out.println("Bike path: " + PathCalculatorFactory.getPathCalculator("bike").calculatePath());
        System.out.println("Car path: " + PathCalculatorFactory.getPathCalculator("car").calculatePath());
        System.out.println("Walk path: " + PathCalculatorFactory.getPathCalculator("walk").calculatePath());
    }
}
