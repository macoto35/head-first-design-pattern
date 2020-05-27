package real;

import java.util.ArrayList;

public class TestDrive {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(){{add("one"); add("two"); add("three");}};
        IteratorEnumeration ie = new IteratorEnumeration(list.iterator());

        while(ie.hasMoreElements()) {
            System.out.println((String) ie.nextElement());
        }
    }

}