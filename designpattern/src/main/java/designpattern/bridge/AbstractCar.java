package designpattern.bridge;

public abstract class AbstractCar {
    private Transmission transmission;
    public abstract void run();

    public void changeGear() {
        transmission.gear();
    }
    public AbstractCar(Transmission transmission) {
        this.transmission = transmission;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
}
