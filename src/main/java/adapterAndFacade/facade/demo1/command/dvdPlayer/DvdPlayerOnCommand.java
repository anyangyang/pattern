package adapterAndFacade.facade.demo1.command.dvdPlayer;

import adapterAndFacade.facade.demo1.command.Command;
import adapterAndFacade.facade.demo1.devices.DvdPlayer;
import adapterAndFacade.facade.demo1.param.CommandParam;

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
