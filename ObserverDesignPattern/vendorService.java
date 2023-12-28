public class vendorService implements Consumer{
    @Override
    public String getNofification(String message) {
        return "vendorService: " + message;
    }
}
