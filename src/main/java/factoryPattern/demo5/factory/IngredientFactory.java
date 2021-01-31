package factoryPattern.demo5.factory;

import factoryPattern.demo5.ingredient.cheese.Cheese;
import factoryPattern.demo5.ingredient.clam.Clam;
import factoryPattern.demo5.ingredient.dough.Dough;
import factoryPattern.demo5.ingredient.pepperoni.Pepperoni;
import factoryPattern.demo5.ingredient.sauce.Sauce;
import factoryPattern.demo5.ingredient.veggie.Veggie;

public abstract class IngredientFactory {

    public abstract Dough createDough();

    public abstract Clam createClam();

    public abstract Pepperoni createPepperoni();

    public abstract Veggie[] createVeggie();

    public abstract Cheese createCheese();

    public abstract Sauce createSauce();
}
