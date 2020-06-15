package chapter7.facade.demo1.command.dvdPlayer;

import chapter7.facade.demo1.command.Command;
import chapter7.facade.demo1.devices.DvdPlayer;
import chapter7.facade.demo1.param.CommandParam;

public class DvdPlayerOffCommand implements Command{

    private DvdPlayer dvdPlayer;

    public DvdPlayerOffCommand(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    @Override
    public void execute(CommandParam param) {
        dvdPlayer.off();
    }
}
