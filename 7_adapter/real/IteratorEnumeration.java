package real;

import java.util.Iterator;

public class IteratorEnumeration implements Enumberation {
    private Iterator it;

    public IteratorEnumeration(Iterator it) {
        this.it = it;
    }

    public boolean hasMoreElements() {
        return it.hasNext();
    }

    public Object nextElement() {
        return it.next();
    }
}