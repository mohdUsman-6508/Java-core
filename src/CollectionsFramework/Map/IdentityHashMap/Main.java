package CollectionsFramework.Map.IdentityHashMap;

import java.util.IdentityHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // hashcode ka khel he
        // whether it is using hashcode method of its own or 'Object' class
        // Object generate hashcode based on the reference
        // like String use its own hashcode , generate hashcode based on the value

        String key1 = new String("key"); // 1
        String key2 = new String("key"); // 1
        //same hashcode based on the value and .equals() method

        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        //identityHashCode means Object hashcode method

        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());

        Map<String, Integer> map = new IdentityHashMap<>();
        // IdentityHashcode and ==

        map.put(key1, 1);
        map.put(key2, 2);
        System.out.println(map);
    }
}
