package DecoratorPattern.demo3;

import java.math.BigDecimal;

public class DarkRoast extends Beverage{

    @Override
    String getDesciption() {
        return "DarkRoast";
    }

    @Override
    BigDecimal getCost() {
        return new BigDecimal("13.5");
    }
}
