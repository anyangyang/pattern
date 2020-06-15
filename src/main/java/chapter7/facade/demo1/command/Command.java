package chapter7.facade.demo1.command;

import chapter7.facade.demo1.param.CommandParam;

public interface Command {

    void execute(CommandParam param);
}
