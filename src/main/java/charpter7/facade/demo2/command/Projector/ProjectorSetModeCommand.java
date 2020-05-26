package charpter7.facade.demo2.command.Projector;

import charpter7.facade.demo2.command.Command;
import charpter7.facade.demo2.devices.Projector;
import charpter7.facade.demo2.param.CommandParam;

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
