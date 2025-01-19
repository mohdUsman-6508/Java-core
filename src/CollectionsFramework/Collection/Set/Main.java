package CollectionsFramework.Collection.Set;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class Main {
    public static void main(String[] args) {

//        HashSet<Integer> set=new HashSet<>();
        NavigableSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(2);
        set.add(3);
        System.out.println(set);

        for (int i : set) {
            System.out.println(i);
        }

        // for Thread Safety

        ConcurrentSkipListSet<Integer> nums = new ConcurrentSkipListSet<>();

        // unmodifiable

        Set<Integer> vals = Set.of(1, 2, 3, 4);
        System.out.println(vals);

    }
}

/*
Notes:
    Set is a collection that cannot contain duplicate elements
    faster operations
    Map--> HashMap, LinkedHashMap, TreeMap, EnumMap
    Set--> HashSet, LinkedHashSet, TreeSet, EnumSet

    Map word ko replace kardo Set se
 */