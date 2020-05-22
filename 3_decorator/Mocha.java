public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public CoffeeSize getSize() {
        return this.beverage.getSize();
    }

    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    public double cost() {
        return beverage.cost() + this.costBySize();
    }

    private double costBySize() {
        CoffeeSize size = this.getSize();
        //System.out.println("모카:" + size);

        if (size == CoffeeSize.TALL)
            return .20;
        else if (size == CoffeeSize.GRANDE)
            return .25;
        else
            return .30;
    }
}