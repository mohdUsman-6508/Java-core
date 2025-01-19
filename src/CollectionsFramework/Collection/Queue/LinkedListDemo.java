package CollectionsFramework.Collection.Queue;

import java.util.Queue;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {


        //Queue interface can be implemented by ( Priority queue, LinkedList ) etc.
        LinkedList<Integer> que=new LinkedList<>();
        que.addLast(3);
        que.addLast(2);
        que.addLast(1);

        System.out.println(que);
        System.out.println(que.removeFirst()); //FIFO
        System.out.println(que);

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.offer(3);
        q.add(4);

        System.out.println(q.element()); // throw exception
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.remove()); // throw exception

        // FIFO, LILO

    }
}
