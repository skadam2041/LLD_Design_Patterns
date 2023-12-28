public class Cone  implements  IceCream{
    private IceCream iceCream;

    public Cone(){

    }


    public Cone(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public int getPrice() {
        if(iceCream == null) return  10;
        else return iceCream.getPrice() + 10;
    }

    @Override
    public String getDescription() {
        if(iceCream == null) return " cone ";
        else return iceCream.getDescription() + " cone ";
    }
}
