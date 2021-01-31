package interatorAndComposite.interator.demo2.interator;

import interatorAndComposite.interator.demo2.MenuItem;

import java.util.List;

public class PancakeHouseMenuInterator implements Interator<MenuItem> {

    private List<MenuItem> menuItemList;
    private Integer numOfItem = 0;
    private Integer position = 0;


    public PancakeHouseMenuInterator(List<MenuItem> menuItemList, Integer numOfItem) {
        this.menuItemList = menuItemList;
        this.numOfItem = numOfItem;
    }

    @Override
    public Boolean hasNext() {
        return position < numOfItem;
    }

    @Override
    public MenuItem next() {
        if(!hasNext()) {
            throw new RuntimeException("no menu item");
        }
        MenuItem menuItem = menuItemList.get(position);
        position++;
        return menuItem;
    }
}
