package chapter3.demo2;

import java.math.BigDecimal;

/**
 * 脱咖啡因咖啡
 */
public class Decaf extends Beverage {

    @Override
    String getDesciption() {
        return "Decaf" + super.getCondimentDesc();
    }

    @Override
    BigDecimal getCost() {
        return new BigDecimal("18").add(super.getCondimentCost());
    }
}
