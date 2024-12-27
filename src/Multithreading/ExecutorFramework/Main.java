package Multithreading.ExecutorFramework;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Without Executor Framework
        //Here we are finding the factorial of 10 numbers using Multithreading
        // here we are doing all the work and Java is having fun :<

        // without multithreading
        /*
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 9; i++) {
            Thread.sleep(1000);
            int result = fact(i);
            System.out.println(result);
        }
        System.out.println("Time: " + (System.currentTimeMillis() - startTime));
         */

        long time = System.currentTimeMillis();
        Thread[] threads = new Thread[9];
        for (int i = 0; i < 9; i++) {
            int finalI = i;
            threads[i] = new Thread(() -> {
                int result = fact(finalI);
            });
            threads[i].start();
        }
        for (Thread t : threads) t.join();
        System.out.println("Time: " + (System.currentTimeMillis() - time));

    }

    public static int fact(int num) {
        if (num == 0 || num == 1) return 1;
        return num * fact(num - 1);
    }
}
