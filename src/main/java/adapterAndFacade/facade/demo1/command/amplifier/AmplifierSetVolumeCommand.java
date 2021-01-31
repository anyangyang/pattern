package adapterAndFacade.facade.demo1.command.amplifier;

import adapterAndFacade.facade.demo1.command.Command;
import adapterAndFacade.facade.demo1.devices.Amplifier;
import adapterAndFacade.facade.demo1.param.CommandParam;

public class AmplifierSetVolumeCommand implements Command{

    private Amplifier amplifier;

    public AmplifierSetVolumeCommand(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    @Override
    public void execute(CommandParam param) {
        if(param == null || param.volume == null) {
            throw new RuntimeException("volume is null");
        }
        amplifier.setVolume(param.volume);
    }
}
