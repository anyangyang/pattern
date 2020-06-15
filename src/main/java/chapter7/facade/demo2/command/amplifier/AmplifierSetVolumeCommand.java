package chapter7.facade.demo2.command.amplifier;

import chapter7.facade.demo2.command.Command;
import chapter7.facade.demo2.devices.Amplifier;
import chapter7.facade.demo2.param.CommandParam;

public class AmplifierSetVolumeCommand implements Command {

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
