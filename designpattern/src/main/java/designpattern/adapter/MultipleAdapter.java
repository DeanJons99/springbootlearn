package designpattern.adapter;

public class MultipleAdapter extends AbstractAdapter {
    @Override
    public int output5V() {
        int output = new Voltage220V().output220v() / 44;
        System.out.println("multiple adapter output " + output + " V电压");
        return output;
    }
}
