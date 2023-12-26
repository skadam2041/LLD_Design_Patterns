public class ToyatoEngine extends CarEngine{
    public String printEngine() {
        return "ToyatoEngine";
    }
    public CarEngine getEngine() {
        return new ToyatoEngine();
    }
}
