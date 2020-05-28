package finalAbstract;

public abstract class CaffineBeverage {
    public final void prepareReceipe() {
        this.boilWater();
        this.brew();
        this.pourInCup();
        this.addCondiments();
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("물 끓이는 중");
    }

    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}