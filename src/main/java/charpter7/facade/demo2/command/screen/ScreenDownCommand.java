package charpter7.facade.demo2.command.screen;

import charpter7.facade.demo2.command.Command;
import charpter7.facade.demo2.devices.Screen;
import charpter7.facade.demo2.param.CommandParam;

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
