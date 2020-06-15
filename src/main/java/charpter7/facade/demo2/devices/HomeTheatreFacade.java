package charpter7.facade.demo2.devices;

import charpter7.facade.demo1.command.Command;
import charpter7.facade.demo2.param.CommandParam;

public class HomeTheatreFacade {

    private PopcornPopper popcornPopper;
    private Light light;
    private Screen screen;
    private Projector projector;
    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;


    public HomeTheatreFacade(PopcornPopper popcornPopper,
                             Light light,
                             Screen screen,
                             Projector projector,
                             Amplifier amplifier,
                             DvdPlayer dvdPlayer) {

        this.popcornPopper = popcornPopper;
        this.light = light;
        this.screen = screen;
        this.projector = projector;
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
    }

    /**
     * 开始电影
     */
    public void watchMovice(CommandParam param) {
        popcornPopper.on();
        popcornPopper.start();
        light.on();
        light.dim(2);
        screen.down();
        projector.on();
        projector.setMode(param.projectorMode);
        projector.setInput(param.projectorInput);
        amplifier.on();
        amplifier.setVolume(param.volume);
        amplifier.setMode(param.amplifierMode);
        dvdPlayer.on();
        dvdPlayer.play(param.movice);
    }

    /**
     * 结束电影
     */
    public void endMovice() {
        light.dim(10);
        dvdPlayer.off();
        amplifier.off();
        projector.off();
        screen.up();
        popcornPopper.off();

    }
}
