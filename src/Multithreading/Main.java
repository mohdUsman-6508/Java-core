package Multithreading;

public class Main {
    public static void main(String[] args) {
//        System.out.println("hello");
//        System.out.println(Thread.currentThread().getName());
//
//        Thread thread1 = new ThreadWord();
//        thread1.start();
//
//        RunnableWord rw = new RunnableWord();
//        Thread thread2 = new Thread(rw);
//        thread2.start();
        Counter c = new Counter();
        Thread t1 = new SynchronizedThread(c);
        Thread t2 = new SynchronizedThread(c);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
            //Without synchronized keyword value of count is not equal to 20000;
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(c.getCount());


    }
}
