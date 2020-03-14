package designpattern.adapter;

public abstract class AbstractAdapter implements IMultipleVoltage {

    @Override
    public int output5V() {
        return 0;
    }

    @Override
    public int output22V() {
        return 0;
    }

    @Override
    public int output10V() {
        return 0;
    }
}
