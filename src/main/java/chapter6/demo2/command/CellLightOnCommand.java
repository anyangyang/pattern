package chapter6.demo2.command;

import chapter6.demo2.light.CellLight;

public class CellLightOnCommand implements Command{

    private CellLight cellLight;

    public CellLightOnCommand(CellLight cellLight) {
        this.cellLight = cellLight;
    }

    @Override
    public void execute() {
        cellLight.on();
    }

    @Override
    public void undo() {
        cellLight.off();
    }
}
