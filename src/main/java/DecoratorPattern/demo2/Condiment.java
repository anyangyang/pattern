package DecoratorPattern.demo2;

import java.math.BigDecimal;

public abstract class Condiment {

    public Integer num;

    public Condiment(Integer num) {
        if (num == null) {
            num = 1;
        }
        this.num = num;
    }

    /**
     * 获取饮料的描述
     *
     * @return
     */
    abstract String getDesciption();

    /**
     * 获取金额
     *
     * @return
     */
    abstract BigDecimal getCost();

}
