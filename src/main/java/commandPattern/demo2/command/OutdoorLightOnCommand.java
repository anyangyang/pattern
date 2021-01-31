package commandPattern.demo2.command;

import commandPattern.demo2.light.OutdoorLight;

public class OutdoorLightOnCommand implements Command{

    private OutdoorLight outdoorLight;

    public OutdoorLightOnCommand(OutdoorLight outdoorLight) {
        this.outdoorLight = outdoorLight;
    }

    @Override
    public void execute() {
        outdoorLight.on();
    }

    @Override
    public void undo() {
        outdoorLight.off();
    }
}
