package DecoratorPattern.demo2;

import java.math.BigDecimal;

/**
 * 蒸馏咖啡
 */
public class Espresso extends Beverage {

    @Override
    String getDesciption() {
        return "Espresso"  + super.getCondimentDesc();
    }

    @Override
    BigDecimal getCost() {
        return new BigDecimal("15.9").add(super.getCondimentCost());
    }
}
