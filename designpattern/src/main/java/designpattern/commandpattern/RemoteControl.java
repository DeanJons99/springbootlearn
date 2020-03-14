package designpattern.commandpattern;

import java.util.ArrayList;

public class RemoteControl {
    private ArrayList<Command> cmdList;

    public RemoteControl() {
        cmdList = new ArrayList<>();
    }

    public void addCommand(Command cmd) {
        cmdList.add(cmd);
    }

    public void runCommand(Command cmd) {
        cmd.execute();
    }
}
