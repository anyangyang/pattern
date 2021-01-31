package adapterAndFacade.facade.demo2.command.homeTheatre;

import adapterAndFacade.facade.demo2.command.Command;
import adapterAndFacade.facade.demo2.devices.HomeTheatreFacade;
import adapterAndFacade.facade.demo2.param.CommandParam;

public class HomeTheatrePlayMoviceCommand implements Command{

    private HomeTheatreFacade homeTheatre;

    public HomeTheatrePlayMoviceCommand(HomeTheatreFacade homeTheatre) {
        this.homeTheatre = homeTheatre;
    }

    @Override
    public void execute(CommandParam param) {
        if(param == null || param.movice == null) {
            throw new RuntimeException("movice is null");
        }
        // TODO check arguments
        homeTheatre.watchMovice(param);
    }
}
