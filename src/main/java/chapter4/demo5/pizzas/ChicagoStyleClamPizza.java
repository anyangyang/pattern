package chapter4.demo5.pizzas;

import chapter4.demo5.factory.IngredientFactory;
import chapter4.demo5.ingredient.clam.Clam;

public class ChicagoStyleClamPizza extends Pizza {

    public Clam clam;

    public ChicagoStyleClamPizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = "new york style clam pizza";
    }

    @Override
    public void prepare() {
        System.out.println("prepare for " + this.name);
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
        this.clam = ingredientFactory.createClam();
    }


}
