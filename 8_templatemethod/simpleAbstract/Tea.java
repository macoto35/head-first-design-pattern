package simpleAbstract;

public class Tea extends CaffineBeverage {
    public void prepareReceipe() {
        this.boilWater();
        this.steepTeaBag();
        this.addLemon();
        this.pourInCup();
    }

    public void steepTeaBag() {
        System.out.println("차를 우려내는 중");
    }

    public void addLemon() {
        System.out.println("레몬을 추가하는 중");
    }
}