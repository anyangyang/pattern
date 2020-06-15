package chapter7.facade.demo2.command;

import chapter7.facade.demo2.param.CommandParam;

public interface Command {

    void execute(CommandParam param);
}
