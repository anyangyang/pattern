package chapter7.facade.demo2.command.screen;

import chapter7.facade.demo2.command.Command;
import chapter7.facade.demo2.devices.Screen;
import chapter7.facade.demo2.param.CommandParam;

public class ScreenDownCommand implements Command {

    private Screen screen;

    public ScreenDownCommand(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void execute(CommandParam param) {
       screen.down();
    }
}
