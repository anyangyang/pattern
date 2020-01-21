package chapter6.demo2.command;

import chapter6.demo2.light.OutdoorLight;

public class OutdoorLightOffCommand implements Command {

    private OutdoorLight outdoorLight;

    public OutdoorLightOffCommand(OutdoorLight outdoorLight) {
        this.outdoorLight = outdoorLight;
    }

    @Override
    public void execute() {
        outdoorLight.off();
    }

    @Override
    public void undo() {
        outdoorLight.on();
    }
}
