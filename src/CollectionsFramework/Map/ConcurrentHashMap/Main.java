package CollectionsFramework.Map.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("A", 1);
        map.put("B", 3);
        map.put("D", 5);
        map.put("C", 2);
        System.out.println(map);

        // same methods as of HashMap but it is Thread safe
    }
}

/* Notes:

Java 7 --> segment based locking --> 16 segments --> smaller hashmaps
only the segment being written to or read from is locked
read: do not require locking unless there is a write operation happening on the same segment
write: lock

Java 8 --> no segmentation
       --> Compare And Swap approach --> no locking except resizing or collision

Thread A last saw --> x=1;
Thread A work --> x=10;

if x is still 1, then  change it to 10 else don't change and retry
put --> index

Map --> Sorted --> Thread safe --> ConcurrentSkipListMap


 */
