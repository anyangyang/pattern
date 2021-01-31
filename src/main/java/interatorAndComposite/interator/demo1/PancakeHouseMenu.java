package interatorAndComposite.interator.demo1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {

    private List<MenuItem> menuItemList;

    public PancakeHouseMenu() {
        this.addMenuItem("宫保鸡丁", "好吃", false, new BigDecimal("29.9"));
        this.addMenuItem("辣炒年糕", "好吃", false, new BigDecimal("15"));
        this.addMenuItem("新疆大盘鸡", "好吃", false, new BigDecimal("49.9"));
        this.addMenuItem("兰州拉面", "好吃", false, new BigDecimal("10"));
    }

    private void addMenuItem(String name, String desc, Boolean vegetarian, BigDecimal price) {
        MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
        if(menuItemList == null) {
            menuItemList = new ArrayList<>();
        }
        menuItemList.add(menuItem);
    }

    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }
}
