public class Client {
    public static void main(String[] args) {

        PaymentGateway razorpay = new RazorpayAdapter();
        System.out.println(razorpay.printClassName());

        PaymentGateway payu = new PayUAdapter();
        System.out.println(payu.printClassName());

        //using factory with adapter
        PaymentGateway razorpayFactory = PaymentGatewayFactory.getPaymentGateway("razorpay");
        System.out.println(razorpayFactory.printClassName());
        PaymentGateway payuFactory = PaymentGatewayFactory.getPaymentGateway("payu");
        System.out.println(payuFactory.printClassName());
    }
}
