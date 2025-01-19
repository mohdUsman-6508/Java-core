package CollectionsFramework;

import java.util.*;

public class IterableDemo {
    public static void main(String[] args) {


        // forEach- internally they are iterator
        // Iterable --> Iterator --> ListIterator
        // .hasNext, .next, .remove

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

//        list.forEach(x->System.out.println(x));

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            Integer val = itr.next();
            if (val % 2 == 0) {
                itr.remove();
            }
            // traversing and removing at the same time, it is powerful, isn't it
        }

        ListIterator<Integer> litr = list.listIterator();
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
            if (litr.next() % 2 == 0) {
                litr.remove();
            }
        }
        System.out.print(list + " ");
    }
}
