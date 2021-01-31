package commandPattern.demo2.command;

import commandPattern.demo2.TV;

public class TVNextCommand implements Command{

    private TV tv;

    public TVNextCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.next();
    }

    @Override
    public void undo() {
        tv.prev();
    }
}
