package charpter7.facade.demo1.command.dvdPlayer;

import charpter7.facade.demo1.command.Command;
import charpter7.facade.demo1.devices.DvdPlayer;
import charpter7.facade.demo1.param.CommandParam;

public class DvdPlayerPlayCommand implements Command {

    private DvdPlayer dvdPlayer;

    public DvdPlayerPlayCommand(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    @Override
    public void execute(CommandParam param) {
        if (param == null || param.movice == null) {
            throw new RuntimeException("movice is null");
        }
        dvdPlayer.play(param.movice);
    }
}
