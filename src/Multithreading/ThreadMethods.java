package Multithreading;

public class ThreadMethods extends Thread {
    public ThreadMethods(String name) {
        super(name);
    }

    public void run() {
        try {
            for (int i = 0; i <=1; i++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " is running...");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new ThreadMethods("Grammar Check(t1)");
        Thread t2 = new ThreadMethods("Spelling Check(t2)");
        Thread t3 = new ThreadMethods("Auto Saving(t3)");

        System.out.println(t1.getPriority());
        t1.setPriority(MAX_PRIORITY);
        t2.setPriority(NORM_PRIORITY);
        t3.setPriority(MIN_PRIORITY);
        System.out.println(t1.getPriority());

        t1.start();
        t3.setDaemon(true); // it will be terminated immediately after completion of all 'user Thread'
        t3.start();
        t2.start();

        t2.interrupt(); // Hey, statue
        t1.join(); // Hey first finish t1 then do run following code
//       t1.yield(); // Hey OS give chance to other threads

//        t3.start();

    }
}
