public abstract class Beverage {
    public String description = "제목 없음";

    public CoffeeSize size = CoffeeSize.TALL;

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();

    public void setSize(CoffeeSize size) {
        this.size = size;
    }

    public CoffeeSize getSize() {
        return this.size;
    }
}