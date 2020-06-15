package chapter7.facade.demo1.command.dvdPlayer;

import chapter7.facade.demo1.command.Command;
import chapter7.facade.demo1.devices.DvdPlayer;
import chapter7.facade.demo1.param.CommandParam;

public class DvdPlayerOnCommand implements Command{

    private DvdPlayer dvdPlayer;

    public DvdPlayerOnCommand(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    @Override
    public void execute(CommandParam param) {
        dvdPlayer.on();
    }
}
