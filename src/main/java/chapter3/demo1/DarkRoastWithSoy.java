package chapter3.demo1;

import java.math.BigDecimal;

public class DarkRoastWithSoy extends Beverage {

    @Override
    String getDesciption() {
        return "DarkRoastWithSoy";
    }

    @Override
    BigDecimal getCost() {
        return new BigDecimal("14");
    }
}
