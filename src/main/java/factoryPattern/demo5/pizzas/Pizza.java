package factoryPattern.demo5.pizzas;

import factoryPattern.demo5.factory.IngredientFactory;
import factoryPattern.demo5.ingredient.dough.Dough;
import factoryPattern.demo5.ingredient.sauce.Sauce;

public abstract class Pizza {

    String name;
    protected Dough dough;
    protected Sauce sauce;

    protected IngredientFactory ingredientFactory;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minute at 350");
}

    public void cut() {
        System.out.println("Cut the pizza into splice");
    }

    public void box() {
        System.out.println("Place pizza into offical pizza store box \n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
