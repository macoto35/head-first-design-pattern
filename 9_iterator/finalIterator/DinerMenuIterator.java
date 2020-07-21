package finalIterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
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

    public void remove() {
        if (this.position <= 0) {
            throw new IllegalStateException();
        }

        if (this.menuItems[position - 1] != null) {
            int length = this.menuItems.length;
            for (int i = position - 1; i < length - 1; i++) {
                this.menuItems[i] = this.menuItems[i+1];
            }
            this.menuItems[length - 1] = null;
        }
    }
}