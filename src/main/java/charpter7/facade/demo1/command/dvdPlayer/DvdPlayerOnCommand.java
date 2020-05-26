package charpter7.facade.demo1.command.dvdPlayer;

import charpter7.facade.demo1.command.Command;
import charpter7.facade.demo1.devices.DvdPlayer;
import charpter7.facade.demo1.param.CommandParam;

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
