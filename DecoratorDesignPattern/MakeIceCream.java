public class MakeIceCream {
    public static void main(String[] args) {
        IceCream iceCream = new Chocolate(new Strawberry(new Cone()));
        System.out.println("Price: " + iceCream.getPrice());
        System.out.println("Description: " + iceCream.getDescription());

    }
}
