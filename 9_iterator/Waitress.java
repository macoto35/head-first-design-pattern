import java.util.Iterator;

public class Waitress {
    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> it = this.allMenus.createIterator();
        
        System.out.println("\n VEGETARIAN MENU\n-----");
        while(it.hasNext()) {
            MenuComponent component = it.next();

            try {
                if (component.isVegetarian()) {
                    component.print();
                }
            } catch (UnsupportedOperationException ex) {
                // do nothing
            }
        }
    }
}