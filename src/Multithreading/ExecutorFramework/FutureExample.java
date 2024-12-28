package Multithreading.ExecutorFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> f = executor.submit(() -> {
            try {
                System.out.println("Sleeping...");
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("hello");
            return 1;
        });

        Thread.sleep(1000);
        f.cancel(false);
        //true- cancel it whether it is running or not
        //false- if running then not cancel, otherwise cancel
        System.out.println(f.isCancelled());
        System.out.println(f.isDone());

//        System.out.println(f.get());
        executor.shutdown();

    }
}
