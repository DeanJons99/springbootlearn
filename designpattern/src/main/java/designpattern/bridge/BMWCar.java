package designpattern.bridge;

public class BMWCar extends AbstractCar {
    @Override
    public void run() {
        changeGear();
        System.out.println("BMWCar 开起来了");
    }

    public BMWCar(Transmission transmission) {
        super(transmission);
    }


    public void changeGear(Transmission transmission) {
        setTransmission(transmission);
    }
}
