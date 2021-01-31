package factoryPattern.demo5.pizzas;

import factoryPattern.demo5.factory.IngredientFactory;
import factoryPattern.demo5.ingredient.cheese.Cheese;

public class NYStyleCheesePizza extends Pizza {

    public Cheese cheese;

    public NYStyleCheesePizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = "new york style cheese pizza";
    }

    @Override
    public void prepare() {
        System.out.println("prepare for " + this.name);
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.cheese = ingredientFactory.createCheese();
    }
}
