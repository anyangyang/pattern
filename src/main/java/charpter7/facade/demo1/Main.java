package charpter7.facade.demo1;

import charpter7.facade.demo1.param.CommandParam;

public class Main {

    /**
     * 遥控器
     *
     * @param args
     */
    public static void main(String[] args) {
        Controller controller = Controller.getInstance();
        CommandParam param = new CommandParam();
        param.dim = 2;
        param.projectorMode = "wideScreenMode";
        param.projectorInput = "HDMI";
        param.amplifierMode = "surroundSound";  // 环绕声
        param.volume = 40;
        param.movice = "逃学威龙";

        // 开启爆米花机
        controller.command("popcornPopper_on", param);
        controller.command("popcornPopper_start", param);
        // 开启灯光，调暗亮度
        controller.command("light_on", param);
        controller.command("light_setDim", param);
        // 降下投放屏幕
        controller.command("screen_down", param);
        // 开启投影仪，设置输入类型，设置投影仪播放模式
        controller.command("projector_on", param);
        controller.command("projector_setMode", param);
        controller.command("projector_setInput", param);
        // 开启扬声器，设置扬声器的播放模式
        controller.command("amplifier_on", param);
        controller.command("amplifier_setMode", param);
        controller.command("amplifier_setVolume", param);
        // 打开播放器，开始播放电影
        controller.command("dvdPlayer_on", param);
        controller.command("dvdPlayer_play", param);
        // 电影播放完成
        System.out.println("电影 [ " + param.movice + " ] 播放完成");
        // 开始关闭设置
        // 关闭播放器
        controller.command("dvdPlayer_off", null);
        controller.command("amplifier_off", null);
        controller.command("projector_off", null);
        controller.command("screen_up", null);
        controller.command("light_off", null);
        controller.command("popcornPopper_off", null);

    }
}
