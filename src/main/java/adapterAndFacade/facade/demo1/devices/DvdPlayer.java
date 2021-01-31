package adapterAndFacade.facade.demo1.devices;

public class DvdPlayer {

    private String status;

    public void on() {
        if("on".equals(status)) {
            return;
        }
        this.status = "on";
        System.out.println("Turn on the DVD player");
    }

    public void off() {
        if("off".equals(status)) {
            return;
        }
        this.status = "off";
        System.out.println("Turn off the DVD player");
    }

    public void play(String movie) {
        System.out.println("DvdPlayer is playing " + movie);
    }

}
