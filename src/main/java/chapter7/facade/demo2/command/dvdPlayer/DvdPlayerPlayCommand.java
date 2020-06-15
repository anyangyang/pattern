package chapter7.facade.demo2.command.dvdPlayer;

import chapter7.facade.demo2.command.Command;
import chapter7.facade.demo2.devices.DvdPlayer;
import chapter7.facade.demo2.param.CommandParam;

public class DvdPlayerPlayCommand implements Command {

    private DvdPlayer dvdPlayer;

    public DvdPlayerPlayCommand(DvdPlayer dvdPlayer) {
       this.dvdPlayer = dvdPlayer;
    }

    @Override
    public void execute(CommandParam param) {
        if(param == null || param.movice== null) {
            throw new RuntimeException("movice is null");
        }
        dvdPlayer.play(param.movice);
    }
}
