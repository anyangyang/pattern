package charpter7.facade.demo1;

import charpter7.facade.demo1.command.Command;
import charpter7.facade.demo1.command.Projector.ProjectorOffCommand;
import charpter7.facade.demo1.command.Projector.ProjectorOnCommand;
import charpter7.facade.demo1.command.Projector.ProjectorSetInputCommand;
import charpter7.facade.demo1.command.Projector.ProjectorSetModeCommand;
import charpter7.facade.demo1.command.amplifier.AmplifierOffCommand;
import charpter7.facade.demo1.command.amplifier.AmplifierOnCommand;
import charpter7.facade.demo1.command.amplifier.AmplifierSetModeCommand;
import charpter7.facade.demo1.command.amplifier.AmplifierSetVolumeCommand;
import charpter7.facade.demo1.command.dvdPlayer.DvdPlayerOffCommand;
import charpter7.facade.demo1.command.dvdPlayer.DvdPlayerOnCommand;
import charpter7.facade.demo1.command.dvdPlayer.DvdPlayerPlayCommand;
import charpter7.facade.demo1.command.light.LightOffCommand;
import charpter7.facade.demo1.command.light.LightOnCommand;
import charpter7.facade.demo1.command.light.LightSetDimCommand;
import charpter7.facade.demo1.command.popcornPopper.PopcornPopperOffCommand;
import charpter7.facade.demo1.command.popcornPopper.PopcornPopperOnCommand;
import charpter7.facade.demo1.command.popcornPopper.PopcornPopperStartCommand;
import charpter7.facade.demo1.command.screen.ScreenDownCommand;
import charpter7.facade.demo1.command.screen.ScreenUpCommand;
import charpter7.facade.demo1.devices.*;
import charpter7.facade.demo1.param.CommandParam;

import java.util.HashMap;
import java.util.Map;

/**
 * 控制中心
 */
public class Controller{

    // 当前控制中心所持有的设备
    private PopcornPopper popcornPopper;
    private Light light;
    private Screen screen;
    private Projector projector;
    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;

    public static Controller controller = null;
    // 指令集合
    private Map<String, Command> commandMap = new HashMap<>();

    private Controller() {
        this.initPopcornPopperCommand();
        this.initLightCommand();
        this.initScreenCommand();
        this.initProjectorCommand();
        this.initAmplifierCommand();
        this.initDvdPlayerCommand();
    }


    private void initPopcornPopperCommand() {
        this.popcornPopper = new PopcornPopper();
        commandMap.put("popcornPopper_on", new PopcornPopperOnCommand(popcornPopper));
        commandMap.put("popcornPopper_off", new PopcornPopperOffCommand(popcornPopper));
        commandMap.put("popcornPopper_start", new PopcornPopperStartCommand(popcornPopper));
    }

    private void initLightCommand() {
        this.light = new Light();
        commandMap.put("light_on", new LightOnCommand(light));
        commandMap.put("light_off", new LightOffCommand(light));
        commandMap.put("light_setDim", new LightSetDimCommand(light));
    }

    private void initScreenCommand() {
        this.screen = new Screen();
        commandMap.put("screen_up", new ScreenUpCommand(screen));
        commandMap.put("screen_down", new ScreenDownCommand(screen));
    }

    private void initProjectorCommand() {
        this.projector = new Projector();
        commandMap.put("projector_on", new ProjectorOnCommand(projector));
        commandMap.put("projector_off", new ProjectorOffCommand(projector));
        commandMap.put("projector_setMode", new ProjectorSetModeCommand(projector));
        commandMap.put("projector_setInput", new ProjectorSetInputCommand(projector));
    }

    public void initAmplifierCommand() {
        this.amplifier = new Amplifier();
        commandMap.put("amplifier_on", new AmplifierOnCommand(amplifier));
        commandMap.put("amplifier_off", new AmplifierOffCommand(amplifier));
        commandMap.put("amplifier_setMode", new AmplifierSetModeCommand(amplifier));
        commandMap.put("amplifier_setVolume", new AmplifierSetVolumeCommand(amplifier));
    }

    private void initDvdPlayerCommand() {
        this.dvdPlayer = new DvdPlayer();
        commandMap.put("dvdPlayer_on", new DvdPlayerOnCommand(dvdPlayer));
        commandMap.put("dvdPlayer_off", new DvdPlayerOffCommand(dvdPlayer));
        commandMap.put("dvdPlayer_play", new DvdPlayerPlayCommand(dvdPlayer));
    }

    public void command(String commandType, CommandParam param) {
        if(commandType == null) {
            throw new RuntimeException("unknow command type is null");
        }
        Command command = commandMap.get(commandType);
        if(command == null) {
            throw new RuntimeException("unknow command type: " + commandType);
        }
        command.execute(param);
    }

    public static Controller getInstance() {
        if(controller == null) {
            controller = new Controller();
        }
        return controller;
    }

}
