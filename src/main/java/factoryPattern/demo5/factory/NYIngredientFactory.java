package factoryPattern.demo5.factory;

import factoryPattern.demo5.ingredient.cheese.Cheese;
import factoryPattern.demo5.ingredient.cheese.NYCheese;
import factoryPattern.demo5.ingredient.clam.Clam;
import factoryPattern.demo5.ingredient.clam.NYStyleClam;
import factoryPattern.demo5.ingredient.dough.Dough;
import factoryPattern.demo5.ingredient.dough.NYStyleDough;
import factoryPattern.demo5.ingredient.pepperoni.NYPepperoni;
import factoryPattern.demo5.ingredient.pepperoni.Pepperoni;
import factoryPattern.demo5.ingredient.sauce.NYSauce;
import factoryPattern.demo5.ingredient.sauce.Sauce;
import factoryPattern.demo5.ingredient.veggie.Broccoli;
import factoryPattern.demo5.ingredient.veggie.Romaine;
import factoryPattern.demo5.ingredient.veggie.Veggie;

public class NYIngredientFactory extends IngredientFactory {

    @Override
    public Dough createDough() {
        return new NYStyleDough();
    }

    @Override
    public Clam createClam() {
        return new NYStyleClam();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new NYPepperoni();
    }

    @Override
    public Veggie[] createVeggie() {
        Veggie[] veggies = {new Broccoli(), new Romaine()};
        return veggies;
    }

    @Override
    public Cheese createCheese() {
        return new NYCheese();
    }

    @Override
    public Sauce createSauce() {
        return new NYSauce();
    }
}
