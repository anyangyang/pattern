package charpter7.facade.demo1.command.light;

import charpter7.facade.demo1.command.Command;
import charpter7.facade.demo1.devices.Light;
import charpter7.facade.demo1.param.CommandParam;

public class LightSetDimCommand implements Command{

    private Light light;

    public LightSetDimCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute(CommandParam param) {
        if(param == null || param.dim == null) {
            throw new RuntimeException("dim is null");
        }
        light.dim(param.dim);
    }
}
