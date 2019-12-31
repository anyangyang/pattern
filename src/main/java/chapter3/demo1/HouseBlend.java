package chapter3.demo1;

import java.math.BigDecimal;

public class HouseBlend extends Beverage{

    @Override
    String getDesciption() {
        return "HouseBlend";
    }

    @Override
    BigDecimal getCost() {
        return new BigDecimal("14");
    }
}
