package chapter7.facade.demo2.command.screen;

import chapter7.facade.demo2.command.Command;
import chapter7.facade.demo2.devices.Screen;
import chapter7.facade.demo2.param.CommandParam;

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
