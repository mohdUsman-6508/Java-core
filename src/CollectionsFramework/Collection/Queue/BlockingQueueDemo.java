package CollectionsFramework.Collection.Queue;

import java.util.concurrent.*;

class Consumer implements Runnable {
    private BlockingQueue<Integer> q;

    public Consumer(BlockingQueue<Integer> q) {
        this.q = q;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int val = q.take();
                System.out.println("Consumer consumed:" + val);
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
                Thread.currentThread().interrupt();
            }
        }
    }

}

class Producer implements Runnable {

    private BlockingQueue<Integer> q;
    private int value;

    public Producer(BlockingQueue<Integer> q) {
        this.q = q;
    }

    public void run() {
        while (true) {
            try {
                System.out.println("Producer produced: " + value);
                q.put(value++);
                Thread.sleep(1000);

            } catch (Exception e) {
                System.out.println(e);
                Thread.currentThread().interrupt();
            }
        }

    }
}

public class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(1);
        // A bounded, blocking queue backed by an array
        // low memory overhead
        // uses a single lock for both enqueue and dequeue operations
        // more threads --> problem

        Thread t1 = new Thread(new Producer(queue));
        Thread t2 = new Thread(new Consumer(queue));
        t1.start();
        t2.start();

        BlockingQueue<Integer> q = new LinkedBlockingQueue<>();
        //optionally bounded backed by LinkedList
        //uses two separate locks for enqueue and dequeue operations
        // Higher concurrency between producers and consumers
        BlockingQueue<Integer> q1 = new PriorityBlockingQueue<>();
        // unbounded
        //Binary Heap as array and can grow dynamically
        // Head is  based on their natural ordering or a provided comparator

        //
        SynchronousQueue<Integer> sq = new SynchronousQueue<>();
        //

    }


    /*
    thread-safe queue
    wait for queue to become non-empty/ wait for space
    simplify concurrency problems like producer-consumer
    standard queue --> immediately
        empty--> remove (no waiting)
        full--> add (no waiting)
    Blocking queue
        put --> Blocks if the queue is full until space becomes available
        take --> Blocks if the queue is empty until an element becomes available
        offer --> Waits for space to become available, up to the specified timeout
     */
}
