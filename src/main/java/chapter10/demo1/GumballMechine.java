package chapter10.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * 球形口香糖投币售卖机
 */
public class GumballMechine {

    public static final Integer NO_QUARTER = 0;      // 初始状态
    public static final Integer HAS_QUARTER = 1;     // 投入硬币
    public static final Integer GUNBALL_SOLD = 2;    // 口香糖弹出中
    public static final Integer SOLD_OUT = 3;        // 机器中口香糖库存不足

    // 状态描述
    public static final Map<Integer, String> statusMap = new HashMap<>();
    static {
        statusMap.put(0, "NO_QUARTER");
        statusMap.put(1, "HAS_QUARTER");
        statusMap.put(2, "GUNBALL_SOLD");
        statusMap.put(3, "SOLD_OUT");
    }
    // 剩余口香糖数量
    private Integer count;
    // 默认已经售卖完
    private Integer state = SOLD_OUT;

    public GumballMechine(Integer count) {
        if (count == null) {
            count = 0;
        }
        this.count = count;
        if(count > 0) {
            this.state = NO_QUARTER;    // 如果当前机器中口香糖数量大于0。设置为初始化状态，否则默认为已经售卖完成的状态
        }
    }
    // 投入硬币
    public void insertQuarter() {
        if (this.state.equals(NO_QUARTER)) {
            this.state = HAS_QUARTER;
            System.out.println("you inserted a quarter");
        }
        else if (this.state.equals(HAS_QUARTER)) {
            System.out.println("you can't insert another quarter");
        }
        else if (this.state.equals(GUNBALL_SOLD)) {
            System.out.println("please wait, we are already giving you a gunball");
        }
        else if (this.state.equals(SOLD_OUT)) {
            System.out.println("you can't insert a quarter, the machine is sold out");
        }
    }

    /**
     * 弹出硬币
     */
    public void ejectQuarter() {
        if (this.state.equals(NO_QUARTER)) {
            System.out.println("you haven't inserted a quarter yet");
        }
        else if (this.state.equals(HAS_QUARTER)) {
            System.out.println("quarter returned");
            this.state = NO_QUARTER;
        }
        else if (this.state.equals(GUNBALL_SOLD)) {
            System.out.println("Sorry, you already turned crank");
        }
        else if (this.state.equals(SOLD_OUT)) {
            System.out.println("you can't eject, you 't inserted a quarter yet");
        }
    }

    /**
     * 转动曲杆
     */
    public void turnCrank() {
        if (this.state.equals(NO_QUARTER)) {
            System.out.println("you turned, but there's no quarter");  // there is not any quarters
        }
        else if (this.state.equals(HAS_QUARTER)) {
            System.out.println("you turned...");
            this.state = GUNBALL_SOLD;
            this.dispense();
        }
        else if (this.state.equals(GUNBALL_SOLD)) {
            System.out.println("turning twice doesn't get you another gumball");
        }
        else if (this.state.equals(SOLD_OUT)) {
            System.out.println("you turned, but there is no gumballs");
        }
    }

    /**
     * 弹出口香糖
     */
    public void dispense() {

        if (this.state.equals(NO_QUARTER)) {
            System.out.println("you need to pay first");
        }
        else if (this.state.equals(HAS_QUARTER)) {
            System.out.println("no gumball dispensed");
        }
        else if (this.state.equals(SOLD_OUT)) {
            System.out.println("no gumball dispensed");
        }
        else if (this.state.equals(GUNBALL_SOLD)) {
            System.out.println("a gumball comes rolling out of slot");
            count--;
            if(count == 0) {
                System.out.println("Oops, out of gumballs");
                this.state = SOLD_OUT;
            } else {
                this.state = NO_QUARTER;
            }

        }
    }

    public String toString() {
        return "current state of GumballMechine is [ " + statusMap.get(this.state) + " ]. current count of gumball is [ " + this.count + " ]";

    }
}
