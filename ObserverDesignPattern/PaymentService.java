public class PaymentService implements Consumer{
    @Override
    public String getNofification(String message) {
        return "PaymentService: " + message;
    }
}
