public class TransportService implements Consumer{
    @Override
    public String getNofification(String message) {
        return "TransportService: " + message;
    }
}
