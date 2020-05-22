package step3.chicago;

import step3.PizzaIngredientFactory;
import step3.PizzaStore;
import step3.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {
    PizzaIngredientFactory ingredientFactory;

    public ChicagoPizzaStore() {
        this.ingredientFactory = new ChicagoPizzaIngredientFactory();
    }

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza(this.ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(this.ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");

        } else if (type.equals("clam")) {
            pizza = new ClamPizza(this.ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");

        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(this.ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
            
        }

        return pizza;
    }
}