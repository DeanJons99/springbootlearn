package designpattern.bridge;

public class Manual implements Transmission {
    @Override
    public void gear() {
        System.out.println("变速箱是手动档");
    }
}
