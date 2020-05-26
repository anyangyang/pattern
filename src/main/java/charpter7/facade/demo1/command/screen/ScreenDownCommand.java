package charpter7.facade.demo1.command.screen;

import charpter7.facade.demo1.command.Command;
import charpter7.facade.demo1.devices.Screen;
import charpter7.facade.demo1.param.CommandParam;

public class ScreenDownCommand implements Command{

    private Screen screen;

    public ScreenDownCommand(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void execute(CommandParam param) {
       screen.down();
    }
}