public class FlipkartManagement {
    public static void main(String[] args) {
        FlipkartOrderService flipkartOrderService = new FlipkartOrderService();
        flipkartOrderService.addConsumer(new vendorService());
        flipkartOrderService.addConsumer(new vendorService());
        String message = "mobile phone order is confirmed";
        flipkartOrderService.sendNotification(message);
        System.out.println("after adding payment service");
        flipkartOrderService.addConsumer(new PaymentService());
        flipkartOrderService.sendNotification(message);
        System.out.println("after removing vendor service");
        flipkartOrderService.removeConsumer(1);
        flipkartOrderService.sendNotification(message);
    }
}
