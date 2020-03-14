package designpattern.ChainofResponsibility;

public class ChiefTechOfficer extends Handler {
    @Override
    public void process(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 5000) {
            System.out.println(purchaseRequest.getType() + " " + purchaseRequest.getId() + " : 已经被CTO处理");
        } else if (getNextHandler() != null) {
            getNextHandler().process(purchaseRequest);
        }
    }
}
