package adapterAndFacade.facade.demo1.command.amplifier;

import adapterAndFacade.facade.demo1.command.Command;
import adapterAndFacade.facade.demo1.devices.Amplifier;
import adapterAndFacade.facade.demo1.param.CommandParam;

public class AmplifierOffCommand implements Command{

    private Amplifier amplifier;

    public AmplifierOffCommand(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    @Override
    public void execute(CommandParam param) { amplifier.off(); }
}
