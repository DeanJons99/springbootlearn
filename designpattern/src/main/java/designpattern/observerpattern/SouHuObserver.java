package designpattern.observerpattern;

public class SouHuObserver implements IObserver {
    @Override
    public void update(double temp) {
        System.out.println("搜狐天气预报：" + temp + " 度");
    }
}
