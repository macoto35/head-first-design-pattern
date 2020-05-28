package hook;

public abstract class CaffineBeverageWithHook {
    public final void prepareReceipe() {
        this.boilWater();
        this.brew();
        this.pourInCup();
        if (this.customerWantsCondiments()) {
            this.addCondiments();
        }
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("물 끓이는 중");
    }

    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    public boolean customerWantsCondiments() {
        return true;
    }
}