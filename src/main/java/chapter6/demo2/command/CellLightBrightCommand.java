package chapter6.demo2.command;

import chapter6.demo2.light.CellLight;

public class CellLightBrightCommand implements Command{

    private CellLight cellLight;

    public CellLightBrightCommand(CellLight cellLight) {
        this.cellLight = cellLight;
    }

    @Override
    public void execute() {
        cellLight.bright();
    }

    @Override
    public void undo() {
        cellLight.dim();
    }
}
