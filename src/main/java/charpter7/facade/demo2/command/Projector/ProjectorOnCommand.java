package charpter7.facade.demo2.command.Projector;

import charpter7.facade.demo2.command.Command;
import charpter7.facade.demo2.devices.Projector;
import charpter7.facade.demo2.param.CommandParam;

public class ProjectorOnCommand implements Command {

    private Projector projector;

    public ProjectorOnCommand(Projector projector) {
        this.projector = projector;
    }

    @Override
    public void execute(CommandParam param) {
        projector.on();
    }
}