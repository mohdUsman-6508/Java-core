package CollectionsFramework.Map.SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        // SortedMap is an interface which is implemented by TreeMap
        // TreeMap implements Map, SortedMap, NavigableMap it can be referenced by any one of them
        // based on our need to use different methods of them

        SortedMap<Integer, Double> stu = new TreeMap<>();

        stu.put(2, 3.55);
        stu.put(3, 4.21);
        stu.put(1, 4.23);

        System.out.println(stu);
        System.out.println(stu.firstKey());
        System.out.println(stu.lastKey());
        System.out.println(stu.headMap(2));
        System.out.println(stu.tailMap(2));
        System.out.println(stu.size());
    }
}
