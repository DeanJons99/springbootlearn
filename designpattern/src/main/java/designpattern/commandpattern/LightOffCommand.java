package designpattern.commandpattern;

public class LightOffCommand implements Command {
    private Light light;

    @Override
    public void execute() {
        System.out.println("LightOffCommand execute() ");
        light.off();
    }

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }
}
