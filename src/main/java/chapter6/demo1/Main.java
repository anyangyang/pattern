package chapter6.demo1;

public class Main {

    public static void main(String[] args) {
        Controller controller = Controller.getInstance();
        Client client = new Client(controller);

        client.action("TV_on");
        client.action("TV_off");
        client.action("TV_prev");
        client.action("TV_next");
        client.action("CellLight_on");
        client.action("CellLight_off");
        client.action("CellLight_dim");
        client.action("OutdoorLight_on");
        client.action("OutdoorLight_off");

        client.undo();
    }
}
