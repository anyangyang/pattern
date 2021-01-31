package adapterAndFacade.facade.demo1.command.dvdPlayer;

import adapterAndFacade.facade.demo1.command.Command;
import adapterAndFacade.facade.demo1.devices.DvdPlayer;
import adapterAndFacade.facade.demo1.param.CommandParam;

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
