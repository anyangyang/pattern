package chapter3.demo2;

import java.math.BigDecimal;

public class DarkRoast extends Beverage {

    @Override
    String getDesciption() {
        return "DarkRoast"  + super.getCondimentDesc();
    }

    @Override
    BigDecimal getCost() {
        return new BigDecimal("13.5").add(super.getCondimentCost());
    }
}
