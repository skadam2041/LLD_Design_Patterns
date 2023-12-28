package PathCalculatorStrategy;

public class PathCalculatorFactory {
    public static PathCalculator getPathCalculator(String type) {
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
