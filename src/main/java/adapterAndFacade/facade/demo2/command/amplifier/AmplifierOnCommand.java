package adapterAndFacade.facade.demo2.command.amplifier;

import adapterAndFacade.facade.demo2.command.Command;
import adapterAndFacade.facade.demo2.devices.Amplifier;
import adapterAndFacade.facade.demo2.param.CommandParam;

public class AmplifierOnCommand implements Command {

    private Amplifier amplifier;

    public AmplifierOnCommand(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    @Override
    public void execute(CommandParam param) {
        amplifier.on();
    }
}
