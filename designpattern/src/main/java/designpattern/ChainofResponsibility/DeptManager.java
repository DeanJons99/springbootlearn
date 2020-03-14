package designpattern.ChainofResponsibility;

public class DeptManager extends Handler{
    @Override
    public void process(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 1000 && purchaseRequest.getPrice() <= 5000) {
            System.out.println(purchaseRequest.getType() + " " + purchaseRequest.getId() + " : 已经被DeptManager处理");
        } else if (getNextHandler() != null) {
            getNextHandler().process(purchaseRequest);
        }
    }
}
