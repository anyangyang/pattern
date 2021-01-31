package DecoratorPattern.demo2;

import java.math.BigDecimal;

public class HouseBlend extends Beverage {

    @Override
    String getDesciption() {
        return "HouseBlend" + super.getCondimentDesc();
    }

    @Override
    BigDecimal getCost() {
        return new BigDecimal("14").add(super.getCondimentCost());
    }
}
