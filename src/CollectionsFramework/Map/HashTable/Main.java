package CollectionsFramework.Map.HashTable;

import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Legacy
        // Thread Safe, each method is synchronized
        // not null key or value allow
        // Slower than HashMap, in Java 8 concurrentHashMap
        // use linked list only in case of collision

        Hashtable<Integer, Integer> ht = new Hashtable<>();

//        ht.put(1, 10);
//        ht.put(2, 9);
//        ht.put(4, 8);
//        ht.put(3, 7);

        System.out.println(ht);

        ht.forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });

        for (Map.Entry<Integer, Integer> h : ht.entrySet()) {
            System.out.println(h.getKey() + "::" + h.getValue());
        }

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                ht.put(i, i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                ht.put(1000 * i, i);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(ht.size());
    }
}
