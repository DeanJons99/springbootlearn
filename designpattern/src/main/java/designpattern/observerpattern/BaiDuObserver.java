package designpattern.observerpattern;

public class BaiDuObserver implements IObserver {
    @Override
    public void update(double temp) {
        System.out.println("百度天气预报：" + temp + " 度");
    }
}
