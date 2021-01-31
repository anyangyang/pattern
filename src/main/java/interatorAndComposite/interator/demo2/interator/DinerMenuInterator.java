package interatorAndComposite.interator.demo2.interator;

import interatorAndComposite.interator.demo2.MenuItem;

public class DinerMenuInterator implements Interator {

    private MenuItem[] menuItems;
    private Integer numOfItem = 0;
    private Integer position = 0;

    public DinerMenuInterator(MenuItem[] menuItems, Integer numOfItem) {
        this.menuItems = menuItems;
        this.numOfItem = numOfItem;
    }

    @Override
    public Boolean hasNext() {
        return position < numOfItem;
    }

    @Override
    public Object next() {
        if(!hasNext()) {
            throw new RuntimeException("no menu item");
        }
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
