package interatorAndComposite.interator.demo1;

import java.util.List;

public class Waitress {

    private DinerMenu dinerMenu;     // lunchMenu
    private PancakeHouseMenu pancakeHouseMenu;  // breakfastMenu

    public Waitress() {
        dinerMenu = new DinerMenu();
        pancakeHouseMenu = new PancakeHouseMenu();
    }


    public void printMenu() {
        this.printBreakfastMenu();
        System.out.println();
        this.printLunchMenu();
    }

    public void printBreakfastMenu() {
        System.out.println("****** breakfast menu ******");
        List<MenuItem> list = pancakeHouseMenu.getMenuItemList();
        if (list == null) {
            return;
        }
        for (MenuItem menuItem : list) {
            System.out.println(menuItem.toString());
        }

    }

    public void printLunchMenu() {
        System.out.println("****** lunch menu ******");
        MenuItem[] array = dinerMenu.getMenuItems();
        if (array == null) {
            return;
        }

        Integer len = dinerMenu.getNumOfItem();
        for(int i = 0; i < len; i++) {
            MenuItem menuItem = array[i];
            System.out.println(menuItem.toString());
        }
    }


}
