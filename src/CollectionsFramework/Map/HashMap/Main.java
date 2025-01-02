package CollectionsFramework.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> student = new HashMap<>();
        //by default initial capacity is 8 and load factor is 0.75

        //add
        student.put(1, "Newton");
        student.put(2, "Issac");
        student.put(3, "Faraday");
        //get
        System.out.println(student.get(2));

        //remove
        student.remove(1);
        System.out.println(student);

        System.out.println(student.size());
        System.out.println(student.isEmpty());
        System.out.println(student.keySet());
        System.out.println(student.entrySet());
        System.out.println(student.containsKey(2));
        System.out.println(student.containsValue("Issac"));


        //traverse

        for (int id : student.keySet()) {
            System.out.print(id + " ");
            System.out.println(student.get(id));
        }

        Set<Map.Entry<Integer, String>> entries = student.entrySet();
        System.out.println(entries);

        for (Map.Entry<Integer, String> entry : student.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        student.forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });

    }


}
