package charpter7.facade.demo1.devices;

/**
 * 投影布
 */
public class Screen {

    private String status;

    public void up() {
        if("up".equals(status)) {
            return;
        }
        this.status = "up";
        System.out.println("screen up");
    }

    public void down() {
        if("down".equals(status)) {
            return;
        }
        this.status = "down";
        System.out.println("screen down");
    }
}
