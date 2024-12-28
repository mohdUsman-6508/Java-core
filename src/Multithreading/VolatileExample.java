package Multithreading;

public class VolatileExample {

    static class SharedResoureVolatile {
        private volatile boolean flag = false; // if you want to see some action just remove volatile keyword from here
        // use volatile here if you want to get the flag value from main memory directly
        // Every thread store its local value as cache
        private int counter;

        public void write() {
            System.out.println("Writing...");
            counter++;
        }

        public void setFlag() {
            flag = true;
        }

        public int getCounter() {
            while (!flag) {
                //do nothing
            }
            return counter;
        }

    }

    public static void main(String[] args) throws InterruptedException {

        SharedResoureVolatile sr = new SharedResoureVolatile();

        Thread write = new Thread(() -> {
            try {
                Thread.sleep(1000);
                sr.setFlag();
                System.out.println("calling write method...");
                sr.write();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread read = new Thread(() -> {
            System.out.println("reading...");
            int i = sr.getCounter();
            System.out.println(i);
        });

        read.start();
        write.start();

        read.join();
        write.join();

        System.out.println("All done!");

    }
}
