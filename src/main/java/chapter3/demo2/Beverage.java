package chapter3.demo2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 饮料
 */
public abstract class Beverage {

    List<Condiment> condiments;

    public void addCondiment(Condiment condiment) {
        if (condiment == null) {
            return;
        }

        if (condiments == null) {
            condiments = new ArrayList<>();
        }

        condiments.add(condiment);
    }

    public BigDecimal getCondimentCost() {
        if (condiments == null) {
            return BigDecimal.ZERO;
        }

        BigDecimal cost = BigDecimal.ZERO;
        for (Condiment condiment : condiments) {
            cost = cost.add(condiment.getCost());
        }

        return cost;
    }

    public String getCondimentDesc() {
        if (condiments == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (Condiment condiment : condiments) {
            sb.append(",").append(condiment.getDesciption());
        }

        return sb.toString();
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
