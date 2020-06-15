package chapter7.facade.demo1.command.Projector;

import chapter7.facade.demo1.command.Command;
import chapter7.facade.demo1.devices.Projector;
import chapter7.facade.demo1.param.CommandParam;

public class ProjectorSetModeCommand implements Command {

    private Projector projector;

    public ProjectorSetModeCommand(Projector projector) {
        this.projector = projector;
    }

    @Override
    public void execute(CommandParam param) {
        if(param == null || param.projectorMode == null) {
            throw new RuntimeException("mode is null");
        }
        projector.setMode(param.projectorMode);
    }
}
