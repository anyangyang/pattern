package adapterAndFacade.facade.demo1.command;

import adapterAndFacade.facade.demo1.param.CommandParam;

public interface Command {

    void execute(CommandParam param);
}
