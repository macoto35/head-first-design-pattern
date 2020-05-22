package step1;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore() {
        this.factory = new SimplePizzaFactory();
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = this.factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}