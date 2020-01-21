package chapter6.demo2.command;

import chapter6.demo2.TV;

public class TVOffCommand implements Command{

    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }


    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
