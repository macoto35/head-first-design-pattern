import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    public boolean hasNext() {
        if (this.stack.empty()) {
            return false;
        } else {
            Iterator<MenuComponent> it = this.stack.peek();
            if (!it.hasNext()) {
                this.stack.pop();
                return this.hasNext();
            } else {
                return true;
            }
        }
    }

    public MenuComponent next() {
        if (this.hasNext()) {
            Iterator<MenuComponent> it = this.stack.peek();
            MenuComponent component = it.next();
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}