package chapter6.demo2.command;

import chapter6.demo2.light.CellLight;

public class CellLightOffCommand implements Command{

    private CellLight cellLight;

    public CellLightOffCommand(CellLight cellLight) {
        this.cellLight = cellLight;
    }


    @Override
    public void execute() {
        cellLight.off();
    }

    @Override
    public void undo() {
        cellLight.on();
    }
}
