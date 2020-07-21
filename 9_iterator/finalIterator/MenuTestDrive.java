package finalIterator;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String[] args) {
        ArrayList<Menu> menus = new ArrayList<Menu>(){{
            add(new PancakeHouseMenu());
            add(new DinerMenu());
            add(new CafeMenu());
        }};

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}