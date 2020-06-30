package chapter7.facade.demo1.command.Projector;

import chapter7.facade.demo1.command.Command;
import chapter7.facade.demo1.devices.Projector;
import chapter7.facade.demo1.param.CommandParam;

public class ProjectorSetInputCommand implements Command{

    private Projector projector;

    public ProjectorSetInputCommand(Projector projector) {
        this.projector = projector;
    }

    @Override
    public void execute(CommandParam param) {
        if(param == null || param.projectorInput == null) {
            throw new RuntimeException("connection is null");
        }
        projector.setInput(param.projectorInput);
    }
}