package chapter4.demo5.factory;

import chapter4.demo5.factory.IngredientFactory;
import chapter4.demo5.ingredient.cheese.Cheese;
import chapter4.demo5.ingredient.cheese.ChicagoCheese;
import chapter4.demo5.ingredient.clam.ChicagoStyleClam;
import chapter4.demo5.ingredient.clam.Clam;
import chapter4.demo5.ingredient.dough.ChicagoStyleDough;
import chapter4.demo5.ingredient.dough.Dough;
import chapter4.demo5.ingredient.pepperoni.ChicagoPepperoni;
import chapter4.demo5.ingredient.pepperoni.Pepperoni;
import chapter4.demo5.ingredient.sauce.ChicagoSauce;
import chapter4.demo5.ingredient.sauce.Sauce;
import chapter4.demo5.ingredient.veggie.Broccoli;
import chapter4.demo5.ingredient.veggie.Cabbage;
import chapter4.demo5.ingredient.veggie.Romaine;
import chapter4.demo5.ingredient.veggie.Veggie;

public class ChicagoIngredientFactory extends IngredientFactory {

    @Override
    public Dough createDough() {
        return new ChicagoStyleDough();
    }

    @Override
    public Clam createClam() {
        return new ChicagoStyleClam();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new ChicagoPepperoni();
    }

    @Override
    public Veggie[] createVeggie() {
        Veggie[] veggies = {new Broccoli(), new Cabbage(), new Romaine()};
        return veggies;
    }

    @Override
    public Cheese createCheese() {
        return new ChicagoCheese();
    }

    @Override
    public Sauce createSauce() {
        return new ChicagoSauce();
    }
}
