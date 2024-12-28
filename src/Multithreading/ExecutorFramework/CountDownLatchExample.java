package Multithreading.ExecutorFramework;

import java.util.concurrent.*;

public class CountDownLatchExample {

    public static void main(String[] args) throws InterruptedException {
        int numOfServices = 3;
        ExecutorService executor = Executors.newFixedThreadPool(numOfServices);
        CountDownLatch latch = new CountDownLatch(numOfServices);
        Future<String> f1 = executor.submit(new DependentService(latch));
        Future<String> f2 = executor.submit(new DependentService(latch));
        Future<String> f3 = executor.submit(new DependentService(latch));

        latch.await();
        System.out.println("Main");
        executor.shutdown();


    }

    static class DependentService implements Callable<String> {
        final CountDownLatch latch;

        public DependentService(CountDownLatch latch) {
            this.latch = latch;
        }

        public String call() {
            try {
                System.out.println(Thread.currentThread().getName() + " service started...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                latch.countDown();
            }
            return "Hello";
        }
    }


}
