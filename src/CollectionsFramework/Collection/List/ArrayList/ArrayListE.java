package CollectionsFramework.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListE {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(list.set(0, 10));
        System.out.println(list.contains(3));
        System.out.println(list.remove(2));
        list.add(1, 100);

        System.out.println(list.isEmpty());

        for (int val : list) System.out.println(val);

        List<Integer> l1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> l2 = List.of(5, 6, 7, 8);

        List<Integer> l3 = new ArrayList<>(l1);
        l3.addAll(l2);

        Collections.sort(list);

        System.out.println(list);
    }
}
