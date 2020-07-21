package myIterator;

public class Waitress {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        MyIterator<MenuItem> pancakeIterator = this.pancakeHouseMenu.createIterator();
        MyIterator<MenuItem> dinerIterator = this.dinerMenu.createIterator();
        System.out.println("메뉴\n----\n아침메뉴");
        this.printMenu(pancakeIterator);
        System.out.println("\n점심메뉴");
        this.printMenu(dinerIterator);
    }

    public void printMenu(MyIterator<MenuItem> iterator) {
        MenuItem item;
        while (iterator.hasNext()) {
            item = iterator.next();
            System.out.println(item.getName() + this.getVegetarianStr(item.isVegetarian()) + " - " + item.getPrice() + " : " + item.getDescription());
        }
    }

    private String getVegetarianStr(boolean isVegetarian) {
        String result = "";
        if (isVegetarian) {
            result = " (v)";
        }
        return result;
    }
}