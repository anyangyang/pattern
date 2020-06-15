package chapter7.facade.demo2.devices;

public class Amplifier {

    private String status;
    private Integer volume;  // 音量 0 - 100
    private String mode;  // 播放模式, 比如：surroundSound（huan）

    public void on() {
        if ("on".equals(status)) {
            return;
        }
        this.status = "on";
        System.out.println("Turn on the Amplifier");
    }

    public void off() {
        if ("off".equals(status)) {
            return;
        }
        this.status = "off";
        System.out.println("Turn off the Amplifier");
    }

    public void setVolume(Integer volume) {
        if (volume > 100) {
            volume = 100;
        } else if (volume < 0) {
            volume = 0;
        }
        this.volume = volume;
        System.out.println("Amplifier volume is " + volume);
    }

    /**
     * 设置播放模式
     *
     * @param mode
     */
    public void setMode(String mode) {
        this.mode = mode;
        System.out.println("Amplifier mode is " + mode);
    }

}
