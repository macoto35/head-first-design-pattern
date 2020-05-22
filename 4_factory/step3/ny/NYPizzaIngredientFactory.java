package step3.ny;

import step3.PizzaIngredientFactory;
import step3.ingredient.dough.*;
import step3.ingredient.sauce.*;
import step3.ingredient.cheese.*;
import step3.ingredient.veggies.*;
import step3.ingredient.pepperoni.*;
import step3.ingredient.clams.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClams() {
        return new FreshClams();
    }
}