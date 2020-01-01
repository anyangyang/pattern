package chapter3.demo2;

import java.math.BigDecimal;

/**
 * condiment
 */
public class StreamMilk extends Condiment {

    public StreamMilk(Integer num) {
        super(num);
    }

    @Override
    String getDesciption() {
        return "StreamMilk [ " + num + " ]";
    }

    @Override
    BigDecimal getCost() {
        BigDecimal num = new BigDecimal(this.num);
        return new BigDecimal("0.8").multiply(num);
    }
}
