package interatorAndComposite.composite.menu;

import java.math.BigDecimal;

public class MenuComponent {

    public String getName() {
        throw new RuntimeException("no name");
    }

    public String getDesc() {
        throw new RuntimeException("no desc");
    }

    public Boolean getVegetarian() {
        throw new RuntimeException("no vegetarian");
    }

    public BigDecimal getPrice() {
        throw new RuntimeException("no price");
    }

    public void add(MenuComponent  menuComponent) {
        throw new RuntimeException("no menuComponent");
    }

    public void print() {
        throw new RuntimeException("print what?");
    }
}
