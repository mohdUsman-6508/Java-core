package CollectionsFramework.Collection.Queue;

import java.util.concurrent.*;

public class DelayedQ {
    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<DelayedTask> dq = new DelayQueue<>();
        // Thread-safe unbounded blocking queue
        // Elements can only be taken from the queue when their delay has expired
        // useful for 'scheduling' tasks to be executed after a certain delay
        // internally priority queue

        dq.put(new DelayedTask("t1", 5, TimeUnit.SECONDS));
        dq.put(new DelayedTask("t2", 3, TimeUnit.SECONDS));
        dq.put(new DelayedTask("t3", 10, TimeUnit.SECONDS));

        while (!dq.isEmpty()) {
            DelayedTask task = dq.take();
            System.out.println("Executed: " + task.getTaskName() + " at " + System.currentTimeMillis());
        }


        // ConcurrentLinkedQueue
        // lock free thread-safe

        ConcurrentLinkedQueue<Integer> clq = new ConcurrentLinkedQueue<>();

        /* thread safe non blocking (compare and swap) strategy */
        ConcurrentLinkedDeque<Integer> c = new ConcurrentLinkedDeque<>();
    }

    static class DelayedTask implements Delayed {

        private final String taskName;
        private final long startTime;

        public DelayedTask(String taksName, long delay, TimeUnit unit) {
            this.taskName = taksName;
            this.startTime = System.currentTimeMillis() + unit.toMillis(delay);
        }

        @Override
        public long getDelay(TimeUnit unit) {
            long remaining = startTime - System.currentTimeMillis();
            return unit.convert(remaining, TimeUnit.MILLISECONDS);
        }

        @Override
        public int compareTo(Delayed o) {
            if (this.startTime < ((DelayedTask) o).startTime) {
                return -1;
            }
            if (this.startTime > ((DelayedTask) o).startTime) {
                return 1;
            }

            return 0;
        }

        public String getTaskName() {
            return taskName;
        }
    }


}
