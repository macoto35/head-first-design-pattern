package step2;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nystore = new NYPizzaStore();
        Pizza pizza = nystore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        PizzaStore chicagostore = new ChicagoPizzaStore();
        pizza = chicagostore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        PizzaStore californiastore = new CaliforniaPizzaStore();
        pizza = californiastore.orderPizza("cheese");
        System.out.println("Sara ordered a " + pizza.getName() + "\n");
    }

}