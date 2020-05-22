public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public CoffeeSize getSize() {
        return this.beverage.getSize();
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", 휘핑 크림";
    }

    public double cost() {
        return this.beverage.cost() + this.costBySize();
    }

    private double costBySize() {
        CoffeeSize size = this.getSize();
        //System.out.println("휘핑 크림:" + size);

        if (size == CoffeeSize.TALL)
            return .10;
        else if (size == CoffeeSize.GRANDE)
            return .15;
        else
            return .20;
    }
}