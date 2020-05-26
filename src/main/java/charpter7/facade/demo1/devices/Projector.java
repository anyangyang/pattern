package charpter7.facade.demo1.devices;

/**
 * 投影仪
 */
public class Projector {

    private String status;
    private String connection;    // 输入格式 VGA，DVI、RCA、HDMI 等
    private String mode;          // 投影模式, 比如 wideScreen (大屏模式)

    public void on() {
        if("on".equals(status)) {
            return;
        }
        this.status = "on";
        System.out.println("Turn on the Projector");
    }

    public void setInput(String input) {
        if(input == null) {
            throw new RuntimeException("faild to set projector connection, input is null");
        }
        // TODO check input type
        this.connection = input;
        System.out.println("current conection of the project is " + input);
    }

    public void setMode(String mode) {
        if(mode == null) {
            throw new RuntimeException("faild to set projector mode, mode is null");
        }
        // TODO check mode type
        this.mode = mode;
        System.out.println("current mode of the project is " + mode);
    }

    public void off() {
        if("off".equals(status)) {
            return;
        }
        this.status = "off";
        System.out.println("Turn off the Projector");
    }

}
