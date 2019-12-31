package chapter3.demo2;

import java.math.BigDecimal;

/**
 * condiment: 酱油
 */
public class Soy extends Beverage {
    @Override
    String getDesciption() {
        return "Soy";
    }

    @Override
    BigDecimal getCost() {
        return new BigDecimal("0.5");
    }
}
