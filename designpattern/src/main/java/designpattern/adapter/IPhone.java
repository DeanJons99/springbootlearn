package designpattern.adapter;

public class IPhone {

    public void charging(Voltage5V voltage5V) {
        voltage5V.output5V();
        System.out.println("IPhone 已经开始充电");
    }

    public void charging(IMultipleVoltage adapter) {
        adapter.output5V();
        System.out.println("IPhone 已经开始充电");
    }
}
