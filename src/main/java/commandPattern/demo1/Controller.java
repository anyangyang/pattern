package commandPattern.demo1;

import commandPattern.demo1.light.CellLight;
import commandPattern.demo1.light.Light;
import commandPattern.demo1.light.OutdoorLight;

import java.util.HashMap;
import java.util.Map;

public class Controller {

    private static Controller singletonController;

    private static Map<String, Object> deviceMap = new HashMap<>();

    private String lastAction;

    static {
        deviceMap.put("TV", new TV());
        deviceMap.put("CellLight", new CellLight());
        deviceMap.put("OutdoorLight", new OutdoorLight());
    }

    private Controller() {}

    public static Controller getInstance() {
        if(singletonController == null) {
            singletonController = new Controller();
        }

        return singletonController;
    }


    public void execute(String action) {
        if("TV_on".equals(action)) {
            TV tv = (TV)deviceMap.get("TV");
            tv.on();
        }
        else if("TV_off".equals(action)) {
            TV tv = (TV)deviceMap.get("TV");
            tv.off();
        }
        else if("TV_prev".equals(action)) {
            TV tv = (TV)deviceMap.get("TV");
            tv.prev();
        }
        else if("TV_next".equals(action)) {
            TV tv = (TV)deviceMap.get("TV");
            tv.next();
        }
        else if("CellLight_on".equals(action)) {
            Light cellLight = (Light)deviceMap.get("CellLight");
            cellLight.on();
        }
        else if("CellLight_off".equals(action)) {
            Light cellLight = (Light)deviceMap.get("CellLight");
            cellLight.off();
        }
        else if("CellLight_dim".equals(action)) {
            CellLight cellLight = (CellLight)deviceMap.get("CellLight");
            cellLight.dim();
        }
        else if("CellLight_bright".equals(action)) {
            CellLight cellLight = (CellLight)deviceMap.get("CellLight");
            cellLight.bright();
        }

        else if("OutdoorLight_on".equals(action)) {
            Light cellLight = (Light)deviceMap.get("OutdoorLight");
            cellLight.on();
        }
        else if("OutdoorLight_off".equals(action)) {
            Light cellLight = (Light)deviceMap.get("OutdoorLight");
            cellLight.off();
        }
        else {
            throw new RuntimeException("unknown action [ " + action + " ]");
        }

        this.lastAction = action;
    }


    public void undo() {
        System.out.print("undo: ");

        if(lastAction == null || lastAction == "") {
           return;
        }
        else if("TV_on".equals(lastAction)) {
            TV tv = (TV)deviceMap.get("TV");
            tv.off();
        }
        else if("TV_off".equals(lastAction)) {
            TV tv = (TV)deviceMap.get("TV");
            tv.on();
        }
        else if("TV_prev".equals(lastAction)) {
            TV tv = (TV)deviceMap.get("TV");
            tv.next();
        }
        else if("TV_next".equals(lastAction)) {
            TV tv = (TV)deviceMap.get("TV");
            tv.prev();
        }
        else if("CellLight_on".equals(lastAction)) {
            Light cellLight = (Light)deviceMap.get("CellLight");
            cellLight.off();
        }
        else if("CellLight_off".equals(lastAction)) {
            Light cellLight = (Light)deviceMap.get("CellLight");
            cellLight.on();
        }
        else if("CellLight_dim".equals(lastAction)) {
            CellLight cellLight = (CellLight)deviceMap.get("CellLight");
            cellLight.bright();
        }
        else if("CellLight_bright".equals(lastAction)) {
            CellLight cellLight = (CellLight)deviceMap.get("CellLight");
            cellLight.dim();
        }
        else if("OutdoorLight_on".equals(lastAction)) {
            Light cellLight = (Light)deviceMap.get("OutdoorLight");
            cellLight.off();
        }
        else if("OutdoorLight_off".equals(lastAction)) {
            Light cellLight = (Light)deviceMap.get("OutdoorLight");
            cellLight.on();
        }
    }

}
