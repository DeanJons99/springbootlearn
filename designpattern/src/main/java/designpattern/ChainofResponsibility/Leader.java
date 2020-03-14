package designpattern.ChainofResponsibility;

public class Leader extends Handler {

    @Override
    public void process(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 1000) {
            System.out.println(purchaseRequest.getType() + " " + purchaseRequest.getId() + " : 已经被leader处理");
        } else if(getNextHandler()!= null) {
            getNextHandler().process(purchaseRequest);
        }
    }
}
