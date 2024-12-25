package Multithreading;

public class Lifecycle extends Thread {

    public Lifecycle(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 2; i++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " is Running...");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception {
        Thread t1 = new Lifecycle("MyThread"); // NEW
        System.out.println(t1.getState());
        t1.start(); // RUNNABLE (It may be running or about to start)
        System.out.println(t1.getState()); // It is running but state will be Runnable
        Thread.sleep(500);
        System.out.println(t1.getState());
        t1.join(); // hey main first finish the t1 then run following code
        System.out.println(t1.getState());
        System.out.println("I ran after t1 is finished.");

    }

}
