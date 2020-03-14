package designpattern.adapter;

public class AdapterVoltageObj implements Voltage5V {
    private Voltage220V voltage220V;

    public Voltage220V getVoltage220V() {
        return voltage220V;
    }

    public void setVoltage220V(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    public AdapterVoltageObj(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int output = 0;
        output = this.voltage220V.output220v() / 44;
        System.out.println("输出 " + " V电压");
        return  output;
    }
}
