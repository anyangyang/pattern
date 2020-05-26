package charpter7.facade.demo1.command.popcornPopper;

import charpter7.facade.demo1.command.Command;
import charpter7.facade.demo1.devices.PopcornPopper;
import charpter7.facade.demo1.param.CommandParam;

public class PopcornPopperStartCommand implements Command{

    private PopcornPopper popcornPopper;

    public PopcornPopperStartCommand(PopcornPopper popcornPopper) {
        this.popcornPopper = popcornPopper;
    }

    @Override
    public void execute(CommandParam param) {
        popcornPopper.start();
    }
}
