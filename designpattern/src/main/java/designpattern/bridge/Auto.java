package designpattern.bridge;

public class Auto implements Transmission {
    @Override
    public void gear() {
        System.out.println("变速箱是自动档");
    }
}
