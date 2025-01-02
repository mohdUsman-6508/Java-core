package CollectionsFramework.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > this.capacity;
    }

    public static void main(String[] args) {

        LRUCache<Character, Integer> bg = new LRUCache<>(3);

        bg.put('A', 1);
        bg.put('O', 3);
        bg.put('B', 2);
        System.out.println(bg);

        bg.get('A');
        bg.put('C', 0);
        System.out.println(bg);


    }
}
