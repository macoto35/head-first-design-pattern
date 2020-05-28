package simpleAbstract;

public class Coffee extends CaffineBeverage  {
    public void prepareReceipe() {
        this.boilWater();
        this.brewCoffeeGrinds();
        this.pourInCup();
        this.addSugarAndMilk();
    }
    public void brewCoffeeGrinds() {
        System.out.println("필터를 통해서 커피를 우려내는 중");
    }

    public void addSugarAndMilk() {
        System.out.println("설탕과 우유를 추가하는 중");
    }
}