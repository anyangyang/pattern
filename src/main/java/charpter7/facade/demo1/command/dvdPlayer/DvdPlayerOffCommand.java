package charpter7.facade.demo1.command.dvdPlayer;

import charpter7.facade.demo1.command.Command;
import charpter7.facade.demo1.devices.DvdPlayer;
import charpter7.facade.demo1.param.CommandParam;

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
