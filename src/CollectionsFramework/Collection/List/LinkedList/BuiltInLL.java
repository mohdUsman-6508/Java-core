package CollectionsFramework.Collection.List.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class BuiltInLL {
    public static void main(String[] args) {
        LinkedList<Integer> node = new LinkedList<>();
        node.add(10);
        node.add(20);
        node.add(30);
        node.add(40);
        System.out.println(node);

        node.removeFirst();
        node.removeLast();
        node.addFirst(100);
        node.addLast(50);
        System.out.println(node);
        System.out.println(node.contains(30));

        for (int i = 0; i < node.size(); i++) {
            System.out.print(node.get(i) + " ");
        }

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("LION", "TIGER", "ELEPHANT", "BEAR"));
        System.out.println(animals);
    }
}
