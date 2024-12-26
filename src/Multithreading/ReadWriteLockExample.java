package Multithreading;

public class ReadWriteLockExample {
    public static void main(String[] args) {
        ReadWriteLock rwl = new ReadWriteLock();

        Runnable writeThread = new Runnable() {
            public void run() {
                for (int i = 0; i <= 5; i++) rwl.writeCount();
            }
        };  //anonymous class in action

        Runnable readThread = new Runnable() {
            public void run() {
                for (int i = 0; i <= 5; i++) rwl.getCount();
            }
        };

        Thread t1 = new Thread(writeThread);
        Thread t2 = new Thread(readThread);
        Thread t3 = new Thread(readThread);

        t1.start();
        t2.start();
        t3.start();

        //hear t2 and t3 reading at the same time without locking each other when t1 is not writing
    }
}
