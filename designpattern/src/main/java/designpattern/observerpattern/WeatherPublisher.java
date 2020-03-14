package designpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherPublisher {
    private List<IObserver> registerList;
    private double temp;

    public void subscribe(IObserver observer) {
        registerList.add(observer);
    }

    public void unsubscribe(IObserver observer) {
        registerList.remove(observer);
    }

    public void publisherTemp(double temp) {
        this.temp = temp;
        System.out.println("中央天气预报：今日 " + temp + "度");
        notifyObserver(temp);

    }

    private void notifyObserver(double temp) {
        for (IObserver observer : registerList) {
            observer.update(temp);
        }
    }

    public WeatherPublisher() {
        registerList = new ArrayList<>();
        this.temp = 0;
    }
}
