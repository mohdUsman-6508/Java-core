package Multithreading.ExecutorFramework;

import java.util.concurrent.*;

public class ScheduledESMore {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ScheduledExecutorService sec = Executors.newSingleThreadScheduledExecutor();

        sec.scheduleAtFixedRate(() -> {
            System.out.println("I am running at every 3 seconds...");
        }, 3, 3, TimeUnit.SECONDS);


        ScheduledFuture<?> sf = sec.scheduleWithFixedDelay(() -> {
            System.out.println("I am runnig at every 2 sec...");
        }, 2, 2, TimeUnit.SECONDS);

        System.out.println(sf.get());

        sec.schedule(() -> {
            System.out.println("Initiating shutdown...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sec.shutdown();
        }, 18, TimeUnit.SECONDS);
    }
}
