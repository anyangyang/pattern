package chapter3.demo2;

import java.math.BigDecimal;

/**
 * condiment
 */
public class Mocha extends Beverage {

    @Override
    String getDesciption() {
        return "Mocha";
    }

    @Override
    BigDecimal getCost() {
        return new BigDecimal("1.5");
    }
}
