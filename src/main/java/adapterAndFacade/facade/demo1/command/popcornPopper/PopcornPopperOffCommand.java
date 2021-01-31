package adapterAndFacade.facade.demo1.command.popcornPopper;

import adapterAndFacade.facade.demo1.command.Command;
import adapterAndFacade.facade.demo1.devices.PopcornPopper;
import adapterAndFacade.facade.demo1.param.CommandParam;

public class PopcornPopperOffCommand implements Command{

    private PopcornPopper popcornPopper;

    public PopcornPopperOffCommand(PopcornPopper popcornPopper) {
        this.popcornPopper = popcornPopper;
    }

    @Override
    public void execute(CommandParam param) {
        popcornPopper.off();
    }
}
