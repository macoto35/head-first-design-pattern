public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public CoffeeSize getSize() {
        return this.beverage.getSize();
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", 두유";
    }

    public double cost() {
        return this.beverage.cost() + this.costBySize();
    }

    private double costBySize() {
        CoffeeSize size = this.getSize();
        //System.out.println("두유:" + size);

        if (size == CoffeeSize.TALL)
            return .15;
        else if (size == CoffeeSize.GRANDE)
            return .20;
        else
            return .25;
    }
}