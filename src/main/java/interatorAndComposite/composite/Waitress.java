package interatorAndComposite.composite;

import interatorAndComposite.composite.menu.Menu;
import interatorAndComposite.composite.menu.MenuComponent;
import interatorAndComposite.composite.menu.MenuItem;

import java.math.BigDecimal;

public class Waitress {

   private MenuComponent allMenus;


    public Waitress() {
        if(allMenus == null) {
            allMenus = new Menu();
        }

        MenuComponent dinerMenu = new Menu();
        dinerMenu.add(new MenuItem("素包", "好吃", true, new BigDecimal(1.5)));
        dinerMenu.add(new MenuItem("肉包", "好吃", false, new BigDecimal(2)));
        dinerMenu.add(new MenuItem("粉丝包", "好吃", false, new BigDecimal(1.5)));
        dinerMenu.add(new MenuItem("小笼包", "好吃", false, new BigDecimal(9)));


        MenuComponent pancakeMenu = new Menu();
        pancakeMenu.add(new MenuItem("宫保鸡丁", "好吃", false, new BigDecimal("29.9")));
        pancakeMenu.add(new MenuItem("辣炒年糕", "好吃", false, new BigDecimal("15")));
        pancakeMenu.add(new MenuItem("新疆大盘鸡", "好吃", false, new BigDecimal("49.9")));
        pancakeMenu.add(new MenuItem("兰州拉面", "好吃", false, new BigDecimal("10")));


        MenuComponent coffeMenu = new Menu();
        MenuComponent dessertMenu = new Menu();

        allMenus.add(dinerMenu);
        allMenus.add(pancakeMenu);
        allMenus.add(coffeMenu);
        allMenus.add(dessertMenu);
    }


    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }


    public void printMenu() {
        if(allMenus == null) {
            System.out.println("There are no menus");
            return;
        }
        allMenus.print();
    }

}
