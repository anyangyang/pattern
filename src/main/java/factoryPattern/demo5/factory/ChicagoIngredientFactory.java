package factoryPattern.demo5.factory;

import factoryPattern.demo5.ingredient.cheese.Cheese;
import factoryPattern.demo5.ingredient.cheese.ChicagoCheese;
import factoryPattern.demo5.ingredient.clam.ChicagoStyleClam;
import factoryPattern.demo5.ingredient.clam.Clam;
import factoryPattern.demo5.ingredient.dough.ChicagoStyleDough;
import factoryPattern.demo5.ingredient.dough.Dough;
import factoryPattern.demo5.ingredient.pepperoni.ChicagoPepperoni;
import factoryPattern.demo5.ingredient.pepperoni.Pepperoni;
import factoryPattern.demo5.ingredient.sauce.ChicagoSauce;
import factoryPattern.demo5.ingredient.sauce.Sauce;
import factoryPattern.demo5.ingredient.veggie.Broccoli;
import factoryPattern.demo5.ingredient.veggie.Cabbage;
import factoryPattern.demo5.ingredient.veggie.Romaine;
import factoryPattern.demo5.ingredient.veggie.Veggie;

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
