package step3.chicago;

import step3.PizzaIngredientFactory;
import step3.ingredient.dough.*;
import step3.ingredient.sauce.*;
import step3.ingredient.cheese.*;
import step3.ingredient.veggies.*;
import step3.ingredient.pepperoni.*;
import step3.ingredient.clams.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new EggPlant(), new Spinach(), new BlackOlives()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClams() {
        return new FrozenClams();
    }
}