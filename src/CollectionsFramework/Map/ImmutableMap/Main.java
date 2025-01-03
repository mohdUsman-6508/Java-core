package CollectionsFramework.Map.ImmutableMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 2);
        map.put("B", 1);

        // Immutable map (we can modify it once created)

        Map<String, Integer> map2 = Collections.unmodifiableMap(map);

        Map<String, Integer> map3 = Map.of("Z", 1, "X", 3);
        //can add upto 10 key value pair

        Map<String, Integer> map4 = Map.ofEntries(Map.entry("AB", 2), Map.entry("AC", 1));
//        map4.put("a",2); //unsupportedOperationException
    }
}
