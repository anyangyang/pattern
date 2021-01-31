package commandPattern.demo2.command;

import commandPattern.demo2.TV;

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
