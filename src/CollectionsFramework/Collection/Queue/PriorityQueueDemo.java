package CollectionsFramework.Collection.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        /*
        part of the Queue interface
        orders elements based on their natural ordering (for primitives lowest first)
        custom comparator for customised elements
         */

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //min-heap
        pq.offer(5);
        pq.add(10);
        pq.add(2);
        pq.add(12);

        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        //we can write our own custom comparator
        //max-heap
        pq1.offer(5);
        pq1.add(10);
        pq1.add(2);
        pq1.add(12);

        System.out.println(pq); //not sorted

        while (!pq.isEmpty()) System.out.print(pq.poll() + " ");

        System.out.println(pq1); //not sorted

        while (!pq1.isEmpty()) System.out.print(pq1.poll() + " ");
    }
}
