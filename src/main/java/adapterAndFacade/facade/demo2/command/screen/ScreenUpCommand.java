package adapterAndFacade.facade.demo2.command.screen;

import adapterAndFacade.facade.demo2.command.Command;
import adapterAndFacade.facade.demo2.devices.Screen;
import adapterAndFacade.facade.demo2.param.CommandParam;

public class ScreenUpCommand implements Command {

    private Screen screen;

    public ScreenUpCommand(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void execute(CommandParam param) {
        screen.up();
    }
}
