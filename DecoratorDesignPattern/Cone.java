public class Cone  implements  IceCream{
    private IceCream iceCream;

    public Cone(){

    }


    public Cone(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public int getPrice() {
        return  10;
    }

    @Override
    public String getDescription() {
        return " cone ";
    }
}
