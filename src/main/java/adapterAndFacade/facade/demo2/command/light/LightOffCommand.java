package adapterAndFacade.facade.demo2.command.light;

import adapterAndFacade.facade.demo2.command.Command;
import adapterAndFacade.facade.demo2.devices.Light;
import adapterAndFacade.facade.demo2.param.CommandParam;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute(CommandParam param) {
         light.off();
    }


}
