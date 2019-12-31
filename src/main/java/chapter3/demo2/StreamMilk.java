package chapter3.demo2;

import java.math.BigDecimal;

/**
 * condiment
 */
public class StreamMilk extends Beverage {

    @Override
    String getDesciption() {
        return "StreamMilk";
    }

    @Override
    BigDecimal getCost() {
        return new BigDecimal("0.8");
    }
}
