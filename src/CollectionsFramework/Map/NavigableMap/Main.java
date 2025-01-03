package CollectionsFramework.Map.NavigableMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        NavigableMap<Integer, Integer> stu = new TreeMap<>();
        stu.put(1, 10);
        stu.put(3, 9);
        stu.put(5, 12);
        stu.put(2, 8);

        System.out.println(stu);

        //It has many methods which make easier to navigate
        System.out.println(stu.firstEntry());
        System.out.println(stu.lastEntry());
        System.out.println(stu.higherEntry(1));
        System.out.println(stu.higherKey(2));
        System.out.println(stu.pollLastEntry());

    }
}
