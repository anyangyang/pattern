package adapterAndFacade.facade.demo1.command.Projector;

import adapterAndFacade.facade.demo1.command.Command;
import adapterAndFacade.facade.demo1.devices.Projector;
import adapterAndFacade.facade.demo1.param.CommandParam;

public class ProjectorOffCommand implements Command{

    private Projector projector;

    public ProjectorOffCommand(Projector projector) {
        this.projector = projector;
    }

    @Override
    public void execute(CommandParam param) {
        projector.off();
    }
}
