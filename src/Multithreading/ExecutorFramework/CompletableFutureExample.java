package Multithreading.ExecutorFramework;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {

        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Waiting...");
                Thread.sleep(3000);
                System.out.println("Worker");
            } catch (Exception e) {
                System.out.println(e);
            }
            return "Ok";
        });
        f1.join();

        //explore other methods

        System.out.println("Main");

    }
}
