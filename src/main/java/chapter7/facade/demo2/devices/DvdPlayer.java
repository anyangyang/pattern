package chapter7.facade.demo2.devices;

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
        if(!"on".equals(status)) {
            throw new RuntimeException("DVD palyer is not active");
        }
        System.out.println("DvdPlayer is playing " + movie);
    }

}
