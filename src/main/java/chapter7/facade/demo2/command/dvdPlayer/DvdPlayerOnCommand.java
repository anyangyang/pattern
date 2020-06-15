package chapter7.facade.demo2.command.dvdPlayer;

import chapter7.facade.demo2.command.Command;
import chapter7.facade.demo2.devices.DvdPlayer;
import chapter7.facade.demo2.param.CommandParam;

public class DvdPlayerOnCommand implements Command {

    private DvdPlayer dvdPlayer;

    public DvdPlayerOnCommand(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    @Override
    public void execute(CommandParam param) {
        dvdPlayer.on();
    }

}
