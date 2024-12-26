package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    private final Lock lock = new ReentrantLock(true);
    // if we want 'FAIRNESS' i.e. all thread get a turn access to shared resources so that no 'STARVATION' occur
    // for that we will pass 'true' as parameter in ReentrantLock() ;

    // avoid deadlock
//    public void outerMethod() {
//        lock.lock();
//        try {
//            System.out.println("Outer Method");
//            innerMethod();
//        } catch (Exception e) {
//            Thread.currentThread().interrupt();
//        } finally {
//            lock.unlock();
//        }
//    }
//
//    public void innerMethod() {
//        lock.lock();
//        try {
//            System.out.println("Inner Method");
//        } catch (Exception e) {
//            Thread.currentThread().interrupt();
//        } finally {
//            lock.unlock();
//        }
//    }

    public void unfairLock() {
        lock.lock();
        try {
            Thread.sleep(1000);
            System.out.println("Access");
            System.out.println(Thread.currentThread().getName() + " is trying to access.");
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockExample r = new ReentrantLockExample();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                r.unfairLock();
            }
        };

        Thread t1 = new Thread(runnable, "t1");
        Thread t2 = new Thread(runnable, "t2");
        Thread t3 = new Thread(runnable, "t3");

//        r.outerMethod();
        //output:
        //outer Method
        //inner method
        t3.start();
        t1.start();
        t2.start();


    }
}

// a count of lock is maintained for the same thread, if a thread is locked a lock
// and try to lock it again then, it will be locked no problem, each lock mush have
// subsequent unlock