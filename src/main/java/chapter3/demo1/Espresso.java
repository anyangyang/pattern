package chapter3.demo1;

import java.math.BigDecimal;

/**
 * 蒸馏咖啡
 */
public class Espresso extends Beverage{

    @Override
    String getDesciption() {
        return "Espresso";
    }

    @Override
    BigDecimal getCost() {
        return new BigDecimal("15.9");
    }
}
