package adapterAndFacade.facade.demo2.command.popcornPopper;

import adapterAndFacade.facade.demo2.command.Command;
import adapterAndFacade.facade.demo2.devices.PopcornPopper;
import adapterAndFacade.facade.demo2.param.CommandParam;

public class PopcornPopperOnCommand implements Command {

    private PopcornPopper popcornPopper;

    public PopcornPopperOnCommand(PopcornPopper popcornPopper) {
        this.popcornPopper = popcornPopper;
    }

    @Override
    public void execute(CommandParam param) {
        popcornPopper.on();
    }
}
