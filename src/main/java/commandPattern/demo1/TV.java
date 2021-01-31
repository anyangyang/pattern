package commandPattern.demo1;

public class TV {

    public void on() {
        System.out.println("TV on");
    }

    public void off() {
        System.out.println("TV off");
    }

    /**
     * 上一个频道
     */
    public void prev() {
        System.out.println("change to previous tv channel");
    }

    /**
     * 下一个频道
     */
    public void next() {
        System.out.println("change to next tv channel");
    }

}
