package designpattern.ChainofResponsibility;

public class PurchaseRequest {
    private String type;
    private int id;
    private float price;

    public PurchaseRequest(String type, int id, float price) {
        this.type = type;
        this.id = id;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
