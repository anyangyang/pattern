package commandPattern.demo2.command;

import commandPattern.demo2.TV;

public class TVPrevCommand implements Command{

    private TV tv;

    public TVPrevCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.prev();
    }

    @Override
    public void undo() {
        tv.next();
    }
}
