package finalAbstract;

public class Tea extends CaffineBeverage {

    public void brew() {
        System.out.println("차를 우려내는 중");
    }

    public void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }
}