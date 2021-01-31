package factoryPattern.demo5.pizzas;

import factoryPattern.demo5.factory.IngredientFactory;
import factoryPattern.demo5.ingredient.veggie.Veggie;

public class NYStyleVeggiePizza extends Pizza {

    public Veggie[] veggies;

    public NYStyleVeggiePizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = "new york style veggie pizza";
    }

    @Override
    public void prepare() {
        System.out.println("prepare for " + this.name);
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.veggies = ingredientFactory.createVeggie();
    }

    @Override
    public void cut() {
        System.out.println("special cut the pizza into square");
    }
}
