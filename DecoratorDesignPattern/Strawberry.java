public class Strawberry implements IceCream{

    private IceCream iceCream;

    public Strawberry(){

    }

    public Strawberry(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getPrice() {
        return this.iceCream.getPrice() + 10;
    }

    @Override
    public String getDescription() {
        return  this.iceCream.getDescription() + " strawberry ";
    }
}
