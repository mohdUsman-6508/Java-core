package CollectionsFramework.Map.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> stu = new TreeMap<>();

        stu.put("Alice", 8);
        stu.put("Bob", 7);
        stu.put("charlie", 10);
        stu.put("alice", 9);

        for (Map.Entry<String, Integer> m : stu.entrySet()) {
            System.out.println(m.getKey() + ":" + m.getValue());
        }

        System.out.println(stu);

    }
}
