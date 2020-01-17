package chapter4.demo5.pizzas;

import chapter4.demo5.factory.IngredientFactory;
import chapter4.demo5.ingredient.pepperoni.Pepperoni;

public class ChicagoStylePepperoniPizza extends Pizza {

    public Pepperoni pepperoni;

    public ChicagoStylePepperoniPizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = "new york style pepperoni pizza";
    }

    @Override
    public void prepare() {
        System.out.println("prepare for " + this.name);
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.pepperoni = ingredientFactory.createPepperoni();
    }
}
