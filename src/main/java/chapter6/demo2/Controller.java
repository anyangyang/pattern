package chapter6.demo2;

import chapter6.demo2.light.CellLight;
import chapter6.demo2.command.*;
import chapter6.demo2.light.OutdoorLight;

import java.util.HashMap;
import java.util.Map;

public class Controller {

    private static Controller singletonController;

    private static Map<String, Command> commandMap = new HashMap<>();

    private Command lastCommand;

    private Controller() {}

    public static Controller getInstance() {
        if(singletonController == null) {
            singletonController = new Controller();
        }

        return singletonController;
    }

    static {
        initTVCommand();
        initCellLightCommand();
        initOutdoorLightCommand();


    }

    private static void initTVCommand() {
        TV tv = new TV();
        commandMap.put("TV_on", new TVOnCommand(tv));
        commandMap.put("TV_off", new TVOffCommand(tv));
        commandMap.put("TV_prev", new TVPrevCommand(tv));
        commandMap.put("TV_next", new TVNextCommand(tv));
    }

    private static void initCellLightCommand() {
        CellLight cellLight = new CellLight();
        commandMap.put("CellLight_on", new CellLightOnCommand(cellLight));
        commandMap.put("CellLight_off", new CellLightOffCommand(cellLight));
        commandMap.put("CellLight_dim", new CellLightDimCommand(cellLight));
    }

    private static void initOutdoorLightCommand() {
        OutdoorLight outdoorLight = new OutdoorLight();
        commandMap.put("OutdoorLight_on", new OutdoorLightOnCommand(outdoorLight));
        commandMap.put("OutdoorLight_off", new OutdoorLightOffCommand(outdoorLight));
    }


    public void execute(String action) {
        Command command = commandMap.get(action);
        if(command == null) {
            return;
        }
        command.execute();
        this.lastCommand = command;
    }

    public void undo() {
        if(lastCommand == null) {
            return;
        }

        lastCommand.undo();
    }

}

