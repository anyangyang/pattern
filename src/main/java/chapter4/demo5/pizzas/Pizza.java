package chapter4.demo5.pizzas;

import chapter4.demo5.factory.IngredientFactory;
import chapter4.demo5.ingredient.clam.Clam;
import chapter4.demo5.ingredient.dough.Dough;
import chapter4.demo5.ingredient.pepperoni.Pepperoni;
import chapter4.demo5.ingredient.sauce.Sauce;
import chapter4.demo5.ingredient.veggie.Veggie;

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
        System.out.println("Place pizza into offical pizza store box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
