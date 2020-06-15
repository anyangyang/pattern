package chapter7.facade.demo1.command.screen;

import chapter7.facade.demo1.command.Command;
import chapter7.facade.demo1.devices.Screen;
import chapter7.facade.demo1.param.CommandParam;

public class ScreenUpCommand implements Command{

    private Screen screen;

    public ScreenUpCommand(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void execute(CommandParam param) {
        screen.up();
    }
}
