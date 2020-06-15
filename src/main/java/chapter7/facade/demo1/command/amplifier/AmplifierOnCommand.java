package chapter7.facade.demo1.command.amplifier;

import chapter7.facade.demo1.command.Command;
import chapter7.facade.demo1.devices.Amplifier;
import chapter7.facade.demo1.param.CommandParam;

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
