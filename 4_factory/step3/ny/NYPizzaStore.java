package step3.ny;

import step3.PizzaStore;
import step3.PizzaIngredientFactory;
import step3.pizza.*;

public class NYPizzaStore extends PizzaStore {
    PizzaIngredientFactory ingredientFactory;

    public NYPizzaStore() {
        this.ingredientFactory = new NYPizzaIngredientFactory();
    }

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza(this.ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(this.ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");

        } else if (type.equals("clam")) {
            pizza = new ClamPizza(this.ingredientFactory);
            pizza.setName("New York Style Clam Pizza");

        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(this.ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
            
        }

        return pizza;
    }
}