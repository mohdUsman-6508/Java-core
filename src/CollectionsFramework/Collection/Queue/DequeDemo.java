package CollectionsFramework.Collection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>(); //fast, low memory,no null allowed
        Deque<Integer> d1 = new LinkedList<>(); //use when you have to do insertion, deletion, somewhere in the middle
        //you can add or remove from both end
        // implemented by ArrayDeque and LinkedList
        // circular array, no need to shift element
        //normal behavior is like queue (FIFO)

        d.addFirst(1);
        d.add(3);
        d.add(4);
        d.offerFirst(6);
        d.addLast(2);
        d.addFirst(0);
        d.pollLast();
        System.out.println(d);

        System.out.println(d.peek());
        System.out.println(d.poll());
        System.out.println(d.removeLast());

        int num = d.getFirst();
    }
}
