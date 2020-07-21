package initial;

import java.util.ArrayList;

public class WaitressWithoutIterator {
    ArrayList<MenuItem> breakfastItems;
    MenuItem[] lunchItems;

    public WaitressWithoutIterator() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        this.breakfastItems = pancakeHouseMenu.getMenuItems();

        DinerMenu dinerMenu = new DinerMenu();
        this.lunchItems = dinerMenu.getMenuItems();
    }

    public void printMenu() {
        MenuItem item;
        
        for (int i = 0; i < this.breakfastItems.size() ; i++) {
            item = this.breakfastItems.get(i);
            System.out.println(item.getName() + this.getVegetarianStr(item.isVegetarian()) + " - " + item.getPrice() + " : " + item.getDescription());
        }

        for (int i = 0; i < this.lunchItems.length ; i++) {
            item = this.lunchItems[i];
            System.out.println(item.getName() + this.getVegetarianStr(item.isVegetarian()) + " - " + item.getPrice() + " : " + item.getDescription());
        }
    }

    public void printBreakfastMenu() {
        MenuItem item;
        for (int i = 0; i < this.breakfastItems.size() ; i++) {
            item = this.breakfastItems.get(i);
            System.out.println(item.getName() + this.getVegetarianStr(item.isVegetarian()) + " - " + item.getPrice() + " : " + item.getDescription());
        }
    }

    public void printLunchMenu() {
        MenuItem item;
        for (int i = 0; i < this.lunchItems.length ; i++) {
            item = this.lunchItems[i];
            System.out.println(item.getName() + this.getVegetarianStr(item.isVegetarian()) + " - " + item.getPrice() + " : " + item.getDescription());
        }
    }

    public void printVegetarianMenu() {
        MenuItem item;
        
        for (int i = 0; i < this.breakfastItems.size() ; i++) {
            item = this.breakfastItems.get(i);
            if (item.isVegetarian()) {
                System.out.println(item.getName() + this.getVegetarianStr(item.isVegetarian()) + " - " + item.getPrice() + " : " + item.getDescription());
            }
        }

        for (int i = 0; i < this.lunchItems.length ; i++) {
            item = this.lunchItems[i];
            if (item.isVegetarian()) {
                System.out.println(item.getName() + this.getVegetarianStr(item.isVegetarian()) + " - " + item.getPrice() + " : " + item.getDescription());
            }
        }
    }

    public boolean isItemVegetarian(String name) {
        MenuItem item;
        
        for (int i = 0; i < this.breakfastItems.size() ; i++) {
            item = this.breakfastItems.get(i);
            if (item.getName().equals(name)) {
                return item.isVegetarian();
            }
        }

        for (int i = 0; i < this.lunchItems.length ; i++) {
            item = this.lunchItems[i];
            if (item.getName().equals(name)) {
                return item.isVegetarian();
            }
        }

        return false;
    }

    private String getVegetarianStr(boolean isVegetarian) {
        String result = "";
        if (isVegetarian) {
            result = " (v)";
        }
        return result;
    }
}