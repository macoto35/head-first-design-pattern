package step3.california;

import step3.PizzaIngredientFactory;
import step3.PizzaStore;
import step3.pizza.*;

public class CaliforniaPizzaStore extends PizzaStore {
    PizzaIngredientFactory ingredientFactory;

    public CaliforniaPizzaStore() {
        this.ingredientFactory = new CaliforniaPizzaIngredientFactory();
    }
    
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza(this.ingredientFactory);
            pizza.setName("California Style Cheese Pizza");

        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(this.ingredientFactory);
            pizza.setName("California Style Veggie Pizza");

        } else if (type.equals("clam")) {
            pizza = new ClamPizza(this.ingredientFactory);
            pizza.setName("California Style Clam Pizza");

        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(this.ingredientFactory);
            pizza.setName("California Style Pepperoni Pizza");
            
        }

        return pizza;
    }
}