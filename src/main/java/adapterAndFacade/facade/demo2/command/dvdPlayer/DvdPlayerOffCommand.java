package adapterAndFacade.facade.demo2.command.dvdPlayer;

import adapterAndFacade.facade.demo2.command.Command;
import adapterAndFacade.facade.demo2.devices.DvdPlayer;
import adapterAndFacade.facade.demo2.param.CommandParam;

public class DvdPlayerOffCommand implements Command {

    private DvdPlayer dvdPlayer;

    public DvdPlayerOffCommand(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    @Override
    public void execute(CommandParam param) {
        dvdPlayer.off();
    }
}
