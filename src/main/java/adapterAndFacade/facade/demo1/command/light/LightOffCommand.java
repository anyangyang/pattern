package adapterAndFacade.facade.demo1.command.light;

import adapterAndFacade.facade.demo1.command.Command;
import adapterAndFacade.facade.demo1.devices.Light;
import adapterAndFacade.facade.demo1.param.CommandParam;

public class LightOffCommand implements Command{

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute(CommandParam param) {
         light.off();
    }
}
