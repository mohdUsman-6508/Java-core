package Multithreading.ExecutorFramework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class MoreExampleES {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        /*
        ExecutorService executor= Executors.newFixedThreadPool(2);
        Future<Integer> sum = executor.submit(() -> 2 + 2);
        Integer i=sum.get();
        executor.shutdown();
        System.out.println(i);
        System.out.println(executor.isShutdown());
        Thread.sleep(100);
        System.out.println(executor.isTerminated());
         */

        ExecutorService exe = Executors.newFixedThreadPool(2);

        Callable<Integer> c1 = () -> {
            Thread.sleep(1000);
            return 1;
        };
        Callable<Integer> c2 = () -> {
            Thread.sleep(1000);
            return 2;
        };
        Callable<Integer> c3 = () -> {
            Thread.sleep(1000);
            return 3;
        };

        List<Callable<Integer>> list = Arrays.asList(c1, c2, c3);
//        exe.invokeAll(list);

        int completedTask=exe.invokeAny(list);
        System.out.println("task "+completedTask);
        try {
            List<Future<Integer>> futures = exe.invokeAll(list, 1000, TimeUnit.MILLISECONDS);
            for (Future<Integer> f : futures) System.out.println(f.get());
        } catch (CancellationException e) {
        }

        exe.shutdown();

    }

}
