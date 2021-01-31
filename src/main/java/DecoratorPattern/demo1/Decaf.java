package DecoratorPattern.demo1;

import java.math.BigDecimal;

/**
 * 脱咖啡因咖啡
 */
public class Decaf extends Beverage{

    @Override
    String getDesciption() {
        return "Decaf";
    }

    @Override
    BigDecimal getCost() {
        return new BigDecimal("18");
    }
}
