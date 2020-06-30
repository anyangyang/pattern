package chapter10.demo2;

import java.util.HashMap;
import java.util.Map;

public class GumballMechine {

    public State NO_QUARTER;  // 初始状态
    public State HAS_QUARTER;     // 投入硬币
    public State GUNBALL_SOLD;    // 口香糖弹出中
    public State SOLD_OUT;        // 机器中口香糖库存不足

    public GumballMechine(int count) {
        NO_QUARTER = new NoQuarterState(this);
        HAS_QUARTER = new HasQuarterState(this);
        GUNBALL_SOLD = new GumballSoldState(this);
        SOLD_OUT = new SoldOutState(this);
        this.count = count;
        this.state = count > 0 ? NO_QUARTER : SOLD_OUT;  // 初始化状态
    }

    private Integer count;    // 剩余口香糖数量

    private State state;   // 默认已经售卖完


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    void insertQuarter() {
        this.state.insertQuarter();
    }

    void ejectQuarter() {
        this.state.ejectQuarter();
    }

    void turnCrank() {
        this.state.turnCrank();
    }

    void dispense() {
        this.state.dispense();
    }


    public String toString() {
        return "current state of GumballMechine is [ " + this.state + " ]. current count of gumball is [ " + this.count + " ]";

    }
}
