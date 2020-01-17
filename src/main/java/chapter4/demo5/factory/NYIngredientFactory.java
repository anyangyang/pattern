package chapter4.demo5.factory;

import chapter4.demo5.factory.IngredientFactory;
import chapter4.demo5.ingredient.cheese.Cheese;
import chapter4.demo5.ingredient.cheese.NYCheese;
import chapter4.demo5.ingredient.clam.Clam;
import chapter4.demo5.ingredient.clam.NYStyleClam;
import chapter4.demo5.ingredient.dough.Dough;
import chapter4.demo5.ingredient.dough.NYStyleDough;
import chapter4.demo5.ingredient.pepperoni.NYPepperoni;
import chapter4.demo5.ingredient.pepperoni.Pepperoni;
import chapter4.demo5.ingredient.sauce.NYSauce;
import chapter4.demo5.ingredient.sauce.Sauce;
import chapter4.demo5.ingredient.veggie.Broccoli;
import chapter4.demo5.ingredient.veggie.Romaine;
import chapter4.demo5.ingredient.veggie.Veggie;

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
