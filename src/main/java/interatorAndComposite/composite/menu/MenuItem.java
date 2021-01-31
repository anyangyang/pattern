package interatorAndComposite.composite.menu;

import java.math.BigDecimal;

public class MenuItem extends MenuComponent{
    private String name;
    private String desc;
    private Boolean vegetarian;
    private BigDecimal price;

    public MenuItem(String name, String desc, Boolean vegetarian, BigDecimal price) {
        this.name = name;
        this.desc = desc;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public Boolean isVegetarian() {
        return vegetarian;
    }

    public BigDecimal getPrice() {
        return price;
    }


    public void print() {
         String str = "name=" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", vegetarian=" + vegetarian +
                ", price=" + price;

        System.out.println(str);
    }
}
