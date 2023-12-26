public class Client {
    public static void main(String[] args) {

        PaymentGateway razorpay = new RazorpayAdapter();
        System.out.println(razorpay.printClassName());

        PaymentGateway payu = new PayUAdapter();
        System.out.println(payu.printClassName());

    }
}
