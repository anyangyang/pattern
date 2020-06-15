package chapter7.facade.demo2;

import chapter7.facade.demo2.param.CommandParam;

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

        // 播放电影
        controller.command("homeTheatre_play", param);
        System.out.println("电影 [ " + param.movice + " ] 播放完成");
        // 播放完成关闭
        controller.command("homeTheatre_end", param);

    }
}
