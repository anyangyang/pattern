package commandPattern.demo2.command;

import commandPattern.demo2.light.CellLight;

public class CellLightDimCommand implements Command{

    private CellLight cellLight;

    public CellLightDimCommand(CellLight cellLight) {
        this.cellLight = cellLight;
    }

    @Override
    public void execute() {
        cellLight.dim();
    }

    @Override
    public void undo() {
        cellLight.bright();
    }
}
