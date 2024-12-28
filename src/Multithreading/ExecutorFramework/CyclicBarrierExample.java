package Multithreading.ExecutorFramework;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {

    public static void main(String[] args) {

        int numberOfSubsystems = 4;

        CyclicBarrier barrier = new CyclicBarrier(numberOfSubsystems, new Runnable() {
            @Override
            public void run() {
                System.out.println("All Subsytem are up and running. System startup completed");
            }
        });

        Thread webServerThread = new Thread(new Subsystem("web Server", 200, barrier));
        Thread databaseThread = new Thread(new Subsystem(" database", 200, barrier));
        Thread cacheThread = new Thread(new Subsystem("cache", 200, barrier));
        Thread messagingServiceThread = new Thread(new Subsystem("messaging", 200, barrier));

        webServerThread.start();
        databaseThread.start();
        cacheThread.start();
        messagingServiceThread.start();

        System.out.println("main");
    }

    static class Subsystem implements Runnable {
        String name;
        int time;
        CyclicBarrier barrier;

        public Subsystem(String name, int time, CyclicBarrier barrier) {
            this.name = name;
            this.time = time;
            this.barrier = barrier;
        }

        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " " + name + " is running...");
                Thread.sleep(time);
                System.out.println(name+" initialization completed.");
                barrier.await();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
