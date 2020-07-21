package myIterator;

import java.util.ArrayList;

public class PancakeHouseIterator implements MyIterator<MenuItem> {
    private ArrayList<MenuItem> items;
    private int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public boolean hasNext() {
        return this.position < this.items.size();
    }

    public MenuItem next() {
        return this.items.get(this.position++);
    }
}