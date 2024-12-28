package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

    static class UpdateMe {
//        private int count;
        private AtomicInteger count=new AtomicInteger(0);
// see the magic of Atomic
        public void increment() {
            count.incrementAndGet();
        }

        public void getCount() {
            System.out.println("count " + count);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        UpdateMe up = new UpdateMe();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                up.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) up.increment();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        up.getCount();
        System.out.println("all done!");

        //problem here is that if we do not use Locks or synchronised than value of count does not update correctly
        //so if we want to do so without using above than  Atomic comes to rescue

    }
}
