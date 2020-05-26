package charpter7.facade.demo2;

import charpter7.facade.demo2.command.Command;
import charpter7.facade.demo2.command.Projector.ProjectorOffCommand;
import charpter7.facade.demo2.command.Projector.ProjectorOnCommand;
import charpter7.facade.demo2.command.Projector.ProjectorSetInputCommand;
import charpter7.facade.demo2.command.Projector.ProjectorSetModeCommand;
import charpter7.facade.demo2.command.amplifier.AmplifierOffCommand;
import charpter7.facade.demo2.command.amplifier.AmplifierOnCommand;
import charpter7.facade.demo2.command.amplifier.AmplifierSetModeCommand;
import charpter7.facade.demo2.command.amplifier.AmplifierSetVolumeCommand;
import charpter7.facade.demo2.command.dvdPlayer.DvdPlayerOffCommand;
import charpter7.facade.demo2.command.dvdPlayer.DvdPlayerOnCommand;
import charpter7.facade.demo2.command.dvdPlayer.DvdPlayerPlayCommand;
import charpter7.facade.demo2.command.homeTheatre.HomeTheatreEndMoviceCommand;
import charpter7.facade.demo2.command.homeTheatre.HomeTheatrePlayMoviceCommand;
import charpter7.facade.demo2.command.light.LightOffCommand;
import charpter7.facade.demo2.command.light.LightOnCommand;
import charpter7.facade.demo2.command.light.LightSetDimCommand;
import charpter7.facade.demo2.command.popcornPopper.PopcornPopperOffCommand;
import charpter7.facade.demo2.command.popcornPopper.PopcornPopperOnCommand;
import charpter7.facade.demo2.command.popcornPopper.PopcornPopperStartCommand;
import charpter7.facade.demo2.command.screen.ScreenDownCommand;
import charpter7.facade.demo2.command.screen.ScreenUpCommand;
import charpter7.facade.demo2.devices.*;
import charpter7.facade.demo2.param.CommandParam;

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
    private HomeTheatreFacade homeTheatre;

    public static Controller controller = null;
    // 指令集合
    private Map<String, Command> commandMap = new HashMap<>();

    private Controller() {
        this.popcornPopper = new PopcornPopper();
        this.screen = new Screen();
        this.light = new Light();
        this.projector = new Projector();
        this.amplifier = new Amplifier();
        this.dvdPlayer = new DvdPlayer();
        this.homeTheatre = new HomeTheatreFacade(popcornPopper,
                light,
                screen,
                projector,
                amplifier,
                dvdPlayer);
        this.initLightCommand();
        this.initProjectorCommand();
        this.initAmplifierCommand();
        this.initDvdPlayerCommand();
        this.initHomeTheatreCommand();

    }

    private void initLightCommand() {
        commandMap.put("light_setDim", new LightSetDimCommand(light));
    }


    private void initProjectorCommand() {
        commandMap.put("projector_setMode", new ProjectorSetModeCommand(projector));
        commandMap.put("projector_setInput", new ProjectorSetInputCommand(projector));
    }

    public void initAmplifierCommand() {

        commandMap.put("amplifier_setMode", new AmplifierSetModeCommand(amplifier));
        commandMap.put("amplifier_setVolume", new AmplifierSetVolumeCommand(amplifier));
    }

    private void initDvdPlayerCommand() {
        commandMap.put("dvdPlayer_on", new DvdPlayerOnCommand(dvdPlayer));
        commandMap.put("dvdPlayer_off", new DvdPlayerOffCommand(dvdPlayer));
        commandMap.put("dvdPlayer_play", new DvdPlayerPlayCommand(dvdPlayer));
    }

    private void initHomeTheatreCommand() {
        commandMap.put("homeTheatre_play", new HomeTheatrePlayMoviceCommand(homeTheatre));
        commandMap.put("homeTheatre_end", new HomeTheatreEndMoviceCommand(homeTheatre));
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
