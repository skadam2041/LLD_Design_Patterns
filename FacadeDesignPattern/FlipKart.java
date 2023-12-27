public class FlipKart {

    private OrderFacade orderFacade = new OrderFacade();
    private PaymentGatewayFacade  paymentGateway = new PaymentGatewayFacade();

    public String PlaceOrder(String orderDetails) {
        return orderFacade.placeOrder(orderDetails);
    }

    public String MakePayment(String paymentDetails) {
        return paymentGateway.makePayment(paymentDetails);
    }



}
