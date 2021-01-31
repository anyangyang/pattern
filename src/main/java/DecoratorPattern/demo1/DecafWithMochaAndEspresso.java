package DecoratorPattern.demo1;

import java.math.BigDecimal;

public class DecafWithMochaAndEspresso extends Beverage{

    @Override
    String getDesciption() {
        return "DecafWithMochaAndEspresso";
    }

    @Override
    BigDecimal getCost() {
        return new BigDecimal("16");
    }
}
