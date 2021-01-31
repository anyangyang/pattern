package adapterAndFacade.facade.demo2.command.amplifier;

import adapterAndFacade.facade.demo2.command.Command;
import adapterAndFacade.facade.demo2.devices.Amplifier;
import adapterAndFacade.facade.demo2.param.CommandParam;

public class AmplifierSetModeCommand implements Command {

    private Amplifier amplifier;

    public AmplifierSetModeCommand(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    @Override
    public void execute(CommandParam param) {
        if(param == null || param.amplifierMode == null) {
            throw new RuntimeException("mode is null");
        }
        amplifier.setMode(param.amplifierMode);
    }
}
