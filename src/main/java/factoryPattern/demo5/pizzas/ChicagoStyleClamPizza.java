package factoryPattern.demo5.pizzas;

import factoryPattern.demo5.factory.IngredientFactory;
import factoryPattern.demo5.ingredient.clam.Clam;

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
