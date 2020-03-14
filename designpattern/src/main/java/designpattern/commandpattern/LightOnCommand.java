package designpattern.commandpattern;

public class LightOnCommand implements Command {
    private Light light;
    @Override
    public void execute() {
        System.out.println("LightOnCommand execute()");
        light.on();
    }

    public LightOnCommand(Light light) {
        this.light = light;
    }
}
