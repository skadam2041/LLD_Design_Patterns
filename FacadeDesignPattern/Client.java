public class Client {
    public static void main(String[] args) {

        String productName = "Deluxe Chair";

        FlipKart flipKart = new FlipKart();
        System.out.println(flipKart.PlaceOrder(productName));

        System.out.println("=================================");
        System.out.println(flipKart.MakePayment(productName));

    }
}
