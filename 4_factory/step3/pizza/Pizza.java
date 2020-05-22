package step3.pizza;

import step3.ingredient.dough.Dough;
import step3.ingredient.sauce.Sauce;
import step3.ingredient.veggies.Veggies;
import step3.ingredient.cheese.Cheese;
import step3.ingredient.pepperoni.Pepperoni;
import step3.ingredient.clams.Clams;

public abstract class Pizza {
    public String name;
    
    public Dough dough;
    public Sauce sauce;
    public Cheese cheese;
    public Veggies veggies[];
    public Pepperoni pepperoni;
    public Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        String result = this.name + " [" + this.dough.toString() + ", " + this.sauce.toString() + ", " + this.cheese.toString();

        if (this.pepperoni != null)
            result += ", " + this.pepperoni.toString();
        
        if (this.clams != null)
            result += ", " + this.clams.toString();
        
        if (this.veggies != null) {
            for (Veggies veggie : this.veggies)
                result += ", " + veggie.toString();
        }

        result += "]";

        return result;
    }
}