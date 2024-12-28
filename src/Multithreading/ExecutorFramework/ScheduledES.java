package Multithreading.ExecutorFramework;

//if we want a work to complete after delay or runs periodically the SES is here in you service

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledES {

    public static void main(String[] args) {
        ScheduledExecutorService sec = Executors.newSingleThreadScheduledExecutor();
        final int[] i = {1};
        sec.schedule(() -> {
            for (int j=0;j<5;j++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("tic tic" + i[0]);
                i[0]++;
            }
        }, 0, TimeUnit.SECONDS);

        sec.schedule(() -> {
            System.out.println("I am running after 5 sec");
        }, 5, TimeUnit.SECONDS);

        sec.shutdown();
    }
}
