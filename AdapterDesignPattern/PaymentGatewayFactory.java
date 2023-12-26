public class PaymentGatewayFactory {

    public  static  PaymentGateway getPaymentGateway(String paymentGateway) {
        if(paymentGateway.equalsIgnoreCase("razorpay")) {
            return new RazorpayAdapter();
        } else if(paymentGateway.equalsIgnoreCase("payu")) {
            return new PayUAdapter();
        }
        return null;
    }
}
