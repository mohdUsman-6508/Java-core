package CollectionsFramework.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // under the hood doubly ll
        // LinkedHashMap extends HashMap
        // Order maintained
        // No Thread Safety
        // IF accessOrder-> true: then LRU element at top, and most recently used element at the bottom
        // ELSE order is same as the order in which you put each element
        // Can be used as LRU cache

        LinkedHashMap<String, Double> stu = new LinkedHashMap<>(3, 0.75f, false);
        stu.put("Issac", 4.12);
        stu.put("Faraday", 3.77);
        stu.put("Khwarizmi", 4.5);
        stu.put("Edison", 3.56);
        System.out.println(stu.get("Faraday"));

        System.out.println(stu);

        stu.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
        for (Map.Entry<String, Double> e : stu.entrySet()) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
    }
}
