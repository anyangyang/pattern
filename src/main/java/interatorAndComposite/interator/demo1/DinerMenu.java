package interatorAndComposite.interator.demo1;

import java.math.BigDecimal;

public class DinerMenu {
    private MenuItem[] menuItems;
    private final int MAX_ITEMS = 6;
    private Integer numOfItem = 0;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        this.addMenuItem("素包", "好吃", true, new BigDecimal(1.5));
        this.addMenuItem("肉包", "好吃", false, new BigDecimal(2));
        this.addMenuItem("粉丝包", "好吃", false, new BigDecimal(1.5));
        this.addMenuItem("小笼包", "好吃", false, new BigDecimal(9));
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    private void addMenuItem(String name, String desc, Boolean vegetarian, BigDecimal price) {
        if(numOfItem >= MAX_ITEMS) {
            throw new RuntimeException("max items");
        }
        MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
        menuItems[numOfItem] = menuItem;
        numOfItem++;
    }

    public Integer getNumOfItem() {
        return numOfItem;
    }
}
