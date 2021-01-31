package commandPattern.demo2.command;

import commandPattern.demo2.light.CellLight;

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
