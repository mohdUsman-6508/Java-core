package Multithreading.ExecutorFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {
    public static void main(String[] args) {

        //Now Java is doing some work, so we can focus on some business logic

        ExecutorService executor = Executors.newFixedThreadPool(3);

        long curr = System.currentTimeMillis();
        for (int i = 0; i < 9; i++) {
            int finalI = i;
            executor.submit(
                    () -> {
                        int result = fact(finalI);
                        System.out.println(result);
                    }
            );
        }
        executor.shutdown();
        System.out.println("Time: " + (System.currentTimeMillis() - curr));


        // Callable, Runnable
        ExecutorService exe = Executors.newSingleThreadExecutor();
        Future<Integer> num = exe.submit(() -> 1);  //callable
        Callable<String> str = () -> "Hello";

//        Runnable run=exe.submit(()->2); give error because it is returning Future but runnable need void return type
        exe.shutdown();

    }

    public static int fact(int num) {
        if (num == 0 || num == 1) return 1;
        return num * fact(num - 1);
    }
}


