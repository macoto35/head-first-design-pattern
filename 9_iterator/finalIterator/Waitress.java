package finalIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    /*private Menu pancakeHouseMenu;
    private Menu dinerMenu;
    private Menu cafeMenu;*/
    private ArrayList<Menu> menus;

    /*public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }*/
    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        /*Iterator<MenuItem> pancakeIterator = this.pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = this.dinerMenu.createIterator();
        Iterator<MenuItem> cafeIterator = this.cafeMenu.createIterator();
        System.out.println("메뉴\n----\n아침메뉴");
        this.printMenu(pancakeIterator);
        System.out.println("\n점심메뉴");
        this.printMenu(dinerIterator);
        System.out.println("\n저녁메뉴");
        this.printMenu(cafeIterator);*/

        for (Menu menu : this.menus) {
            this.printMenu(menu.createIterator());
        }
    }

    public void printMenu(Iterator<MenuItem> iterator) {
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