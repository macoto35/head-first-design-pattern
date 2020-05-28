package hook;

public class BeverageTestDrive {
    public static void main(String[] args) {
        TeaWithHook tea = new TeaWithHook();
        CoffeeWithHook coffee = new CoffeeWithHook();

        System.out.println("\n차 준비중...");
        tea.prepareReceipe();

        System.out.println("\n커피 준비중...");
        coffee.prepareReceipe();
    }

}