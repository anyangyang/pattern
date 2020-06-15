package chapter7.facade.demo2.devices;

public class Light {

    // 灯光亮度，分为 1 - 10 个等级
    private Integer dim;
    private String status;

    public void on() {
        if("on".equals(status)) {
            return;
        }
        this.status = "on";
        this.dim = 5;   // 默认是 5
        System.out.println("Turn on the light, current dim is " + dim);
    }

    public void off() {
        if("off".equals(status)) {
            return;
        }
        this.status = "off";
        System.out.println("Turn off the light");
    }

    public void dim(Integer level) {
        if(level == null) {
            throw new RuntimeException("failed to set light dim, dim is null");
        }
        if(level > 10) {
            level = 10;
        } else if (level < 1){
            level = 1;
        }
        this.dim = level;
        System.out.println("light dim change, current dim is " + dim);
    }

}
