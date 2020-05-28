package simple;

public class Tea {
    public void prepareReceipe() {
        this.boilWater();
        this.steepTeaBag();
        this.addLemon();
        this.pourInCup();
    }

    public void boilWater() {
        System.out.println("물 끓이는 중");
    }

    public void steepTeaBag() {
        System.out.println("차를 우려내는 중");
    }

    public void addLemon() {
        System.out.println("레몬을 추가하는 중");
    }

    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

}