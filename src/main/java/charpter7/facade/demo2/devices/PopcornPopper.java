package charpter7.facade.demo2.devices;

/**
 * 爆米花机
 */
public class PopcornPopper {

    private String status;

    public void on() {
        if(!"off".equals(status)) {
            return;
        }
        this.status = "on";
        System.out.println("Turn on the popcorn popper");
    }

    public void off() {
        if("off".equals(status)) {
            return;
        }
        this.status = "off";
        System.out.println("Turn off the popcorn popper");
    }

    public void start() {
        if(!"on".equals(status)) {
            return;
        }
        System.out.println("Start Popcorn Popper");
    }
}
