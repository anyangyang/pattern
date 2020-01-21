package chapter6.demo2;

import chapter6.demo2.Controller;

public class Client {

    private Controller controller;

    public Client(Controller controller) {
        this.controller = controller;
    }

    public void action(String command) {
        controller.execute(command);
    }

    public void undo() {
        controller.undo();
    }

}
