public class PaymentGatewayFacade {

    private  GeneratePaymentLink generatePaymentLink = new GeneratePaymentLink();
    private StorePayment storePayment = new StorePayment();

    public String makePayment(String productName) {
        String str = generatePaymentLink.generatePaymentLink(productName);
        str += "\n" + storePayment.storePayment(productName);
        return str;
    }
}
