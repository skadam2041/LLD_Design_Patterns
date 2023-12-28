public class Chocolate implements IceCream {
    private IceCream iceCream;

    public Chocolate(){

    }

    public Chocolate(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public int getPrice() {
        return this.iceCream.getPrice() + 25;
    }

    @Override
    public String getDescription() {
        return this.iceCream.getDescription() +  " chocolate ";
    }
}
