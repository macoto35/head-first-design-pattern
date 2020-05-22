package step3;

import step3.pizza.Pizza;
import step3.ny.NYPizzaStore;
import step3.chicago.ChicagoPizzaStore;
//import step3.california.CaliforniaPizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nystore = new NYPizzaStore();
        Pizza pizza = nystore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.toString() + "\n");

        PizzaStore chicagostore = new ChicagoPizzaStore();
        pizza = chicagostore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.toString() + "\n");

        //PizzaStore californiastore = new CaliforniaPizzaStore();
        //pizza = californiastore.orderPizza("cheese");
        //System.out.println("Sara ordered a " + pizza.getName() + "\n");
    }

}