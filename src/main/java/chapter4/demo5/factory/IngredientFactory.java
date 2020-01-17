package chapter4.demo5.factory;

import chapter4.demo5.ingredient.cheese.Cheese;
import chapter4.demo5.ingredient.clam.Clam;
import chapter4.demo5.ingredient.dough.Dough;
import chapter4.demo5.ingredient.pepperoni.Pepperoni;
import chapter4.demo5.ingredient.sauce.Sauce;
import chapter4.demo5.ingredient.veggie.Veggie;

public abstract class IngredientFactory {

    public abstract Dough createDough();

    public abstract Clam createClam();

    public abstract Pepperoni createPepperoni();

    public abstract Veggie[] createVeggie();

    public abstract Cheese createCheese();

    public abstract Sauce createSauce();


}
