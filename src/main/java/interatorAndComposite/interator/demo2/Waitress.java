package interatorAndComposite.interator.demo2;

import interatorAndComposite.interator.demo2.interator.Interator;

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
        Interator<MenuItem> itemInterator = pancakeHouseMenu.createInterator();
        print(itemInterator);
    }

    public void printLunchMenu() {
        System.out.println("****** lunch menu ******");
        Interator<MenuItem> itemInterator = dinerMenu.createInterator();
        print(itemInterator);
    }

    public void print(Interator<MenuItem> itemInterator) {
        while(itemInterator.hasNext()) {
            MenuItem menuItem = itemInterator.next();
            System.out.println(menuItem.toString());
        }
    }

}
