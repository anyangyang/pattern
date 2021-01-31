package adapterAndFacade.facade.demo2.command;

import adapterAndFacade.facade.demo2.param.CommandParam;

public interface Command {

    void execute(CommandParam param);
}
