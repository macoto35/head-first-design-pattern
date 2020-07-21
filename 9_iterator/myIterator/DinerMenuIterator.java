package myIterator;

public class DinerMenuIterator implements MyIterator<MenuItem> {
    private MenuItem[] menuItems;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        return (this.position < this.menuItems.length) && (this.menuItems[this.position] != null);
    }

    public MenuItem next() {
        return this.menuItems[this.position++];
    }
}