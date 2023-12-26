public class RazorpayAdapter implements PaymentGateway {

    RazorpayClinet razorpayClient =  new RazorpayClinet();

    @Override
    public String printClassName() {
        return razorpayClient.print();
    }
}
