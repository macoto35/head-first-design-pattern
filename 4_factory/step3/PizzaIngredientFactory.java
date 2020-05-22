package step3;

import step3.ingredient.dough.Dough;
import step3.ingredient.sauce.Sauce;
import step3.ingredient.cheese.Cheese;
import step3.ingredient.veggies.Veggies;
import step3.ingredient.pepperoni.Pepperoni;
import step3.ingredient.clams.Clams;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}