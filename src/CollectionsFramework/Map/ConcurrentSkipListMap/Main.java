package CollectionsFramework.Map.ConcurrentSkipListMap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class Main {
    // if you need sorted and Thread Safe
    public static void main(String[] args) {

        ConcurrentMap<String, Integer> map = new ConcurrentSkipListMap<>();
        map.put("A", 1);
        map.put("B", 3);
        map.put("D", 5);
        map.put("C", 2);
        System.out.println(map);


    }
}
