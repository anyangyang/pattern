package factoryPattern.demo5.pizzas;

import factoryPattern.demo5.factory.IngredientFactory;
import factoryPattern.demo5.ingredient.pepperoni.Pepperoni;

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
