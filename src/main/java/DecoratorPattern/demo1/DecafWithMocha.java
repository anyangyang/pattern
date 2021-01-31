package DecoratorPattern.demo1;

import java.math.BigDecimal;

public class DecafWithMocha extends Beverage{

    @Override
    String getDesciption() {
        return "DecafWithMocha";
    }

    @Override
    BigDecimal getCost() {
        return new BigDecimal("15");
    }
}
