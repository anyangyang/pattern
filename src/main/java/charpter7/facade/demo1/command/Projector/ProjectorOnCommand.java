package charpter7.facade.demo1.command.Projector;

import charpter7.facade.demo1.command.Command;
import charpter7.facade.demo1.devices.Projector;
import charpter7.facade.demo1.param.CommandParam;

public class ProjectorOnCommand implements Command{

    private Projector projector;

    public ProjectorOnCommand(Projector projector) {
        this.projector = projector;
    }

    @Override
    public void execute(CommandParam param) {
        projector.on();
    }
}
