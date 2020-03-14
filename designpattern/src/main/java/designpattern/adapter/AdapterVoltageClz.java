package designpattern.adapter;

public class AdapterVoltageClz extends Voltage220V implements Voltage5V {
    @Override
    public int output5V() {
        int output = 0;
        output = output220v() / 44;
        System.out.println("输出" + output + "V电压");
        return output;
    }
}
