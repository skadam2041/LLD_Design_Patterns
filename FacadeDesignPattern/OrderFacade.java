public class OrderFacade {

    private final StoreOrder storeOrder = new StoreOrder();
    private final NotifyVendor notifyVendor = new NotifyVendor();
    public String placeOrder(String productName) {
        String str =  storeOrder.storeOrder(productName);
        str += "\n" + notifyVendor.notifyVendor(productName);
        return str;
    }
}
