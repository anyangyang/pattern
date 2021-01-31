package adapterAndFacade.facade.demo2.command.homeTheatre;

import adapterAndFacade.facade.demo2.command.Command;
import adapterAndFacade.facade.demo2.param.CommandParam;
import adapterAndFacade.facade.demo2.devices.HomeTheatreFacade;

public class HomeTheatreEndMoviceCommand implements Command{

    private HomeTheatreFacade homeTheatre;

    public HomeTheatreEndMoviceCommand(HomeTheatreFacade homeTheatre) {
        this.homeTheatre = homeTheatre;
    }

    @Override
    public void execute(CommandParam param) {
        homeTheatre.endMovice();
    }
}
