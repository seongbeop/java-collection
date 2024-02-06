package collection1;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterator1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(3);

        Iterator<Integer> iter = linkedList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());

        }
    }
}
