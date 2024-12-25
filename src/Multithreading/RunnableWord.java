package Multithreading;

public class RunnableWord implements Runnable {

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Auto Saving...");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
