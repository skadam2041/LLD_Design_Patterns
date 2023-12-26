public class PayUAdapter implements PaymentGateway{

    PayUClient payUClient =  new PayUClient();
    @Override
    public String printClassName() {
        return payUClient.print();
    }
}
