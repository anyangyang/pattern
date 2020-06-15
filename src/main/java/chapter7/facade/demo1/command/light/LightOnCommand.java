package chapter7.facade.demo1.command.light;

import chapter7.facade.demo1.command.Command;
import chapter7.facade.demo1.devices.Light;
import chapter7.facade.demo1.param.CommandParam;

public class LightOnCommand implements Command{

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute(CommandParam param) {
        light.on();
    }
}
