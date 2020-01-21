package chapter6.demo2.command;

import chapter6.demo2.TV;

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
