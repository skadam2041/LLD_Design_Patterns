public class MakeIceCream {
    public static void main(String[] args) {
        IceCream iceCream = new Chocolate(new Strawberry(new Cone()));
        System.out.println("Price: " + iceCream.getPrice());
        System.out.println("Description: " + iceCream.getDescription());

        IceCream iceCream2 = new Chocolate(new Strawberry(new Cone(new Chocolate(new Cone()))));
        System.out.println("Price: " + iceCream2.getPrice());
        System.out.println("Description: " + iceCream2.getDescription());

    }
}
