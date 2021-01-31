package interatorAndComposite.composite.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {

    private List<MenuComponent> list;

    public Menu() {
        List<MenuComponent> list = new ArrayList<>();
    }

    public Menu(List<MenuComponent> list) {
        this.list = list;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        if(menuComponent == null) {
            return;
        }
        if(list == null) {
            list = new ArrayList<>();
        }
        this.list.add(menuComponent);
    }

    @Override
    public void print() {
        if(list == null) {
            return;
        }
        // printf
        Iterator it = list.iterator();
        while(it.hasNext()) {
            MenuComponent menuComponent = (MenuComponent)it.next();
            menuComponent.print();
        }

    }
}
