package real;

import java.util.Iterator;

public class EnumerationIterator implements Iterator {

    private Enumberation en;

    public EnumerationIterator(Enumberation en) {
        this.en = en;
    }

    public boolean hasNext() {
        return this.en.hasMoreElements();
    }

    public Object next() {
        return this.en.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}