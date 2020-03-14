package designpattern.prototype;

public class Production implements Cloneable {
    private String name;
    private String color;
    private float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Production() {

    }

    public Production(String name, String color, float price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {

        return "name: " + this.name + " color: " + this.color + " price: " + this.price;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
