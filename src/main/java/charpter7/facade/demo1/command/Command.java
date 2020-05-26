package charpter7.facade.demo1.command;

import charpter7.facade.demo1.param.CommandParam;

public interface Command {

    void execute(CommandParam param);
}
