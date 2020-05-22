package step2;

import java.util.ArrayList;

public abstract class Pizza {
    public String name;    
    public String dough;
    public String sauce;
    public ArrayList<String> toppings = new ArrayList<String>();;

    public void prepare() {
        System.out.println("Preparing " + this.name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.print("Adding toppings: ");
        for (String topping : toppings) {
            System.out.print(" " + topping);
        }
        System.out.println();
    }

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
        return this.name;
    }
}