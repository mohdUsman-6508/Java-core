package Multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountLocks {
    private double balance;

    public BankAccountLocks(double balance) {
        this.balance = balance;
    }

    private final Lock lock = new ReentrantLock();


    public void withdraw(double amount) {
        try {
            if (lock.tryLock(3000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        double remainingBalance = balance - amount;
                        balance = remainingBalance;
                        System.out.println(Thread.currentThread().getName() + " is attempting to withdraw...");
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName() + " withdrew " + amount + " rs.");
                        Thread.sleep(1000);
                        System.out.println(balance + " rs" + " remained.");
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                        ;
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println("Insufficient Balance!");
                }
            } else {
                System.out.print("Sorry " + Thread.currentThread().getName() + " ");
                System.out.println("Resource is Locked!, try later...");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // good practice
            //if we do not use it then we will lose the current state of
        }


    }

}


// synchornized do not give us much control , a thread can exploit a shared resource indefinitely wihtout giving access to other threads waiting
//public class BankAccountLocks {
//    private double balance;
//
//    public BankAccountLocks(double balance) {
//        this.balance = balance;
//    }
//
//    public synchronized void withdraw(double amount) {
//        if (balance >= amount) {
//            try {
//                double remainingBalance = balance - amount;
//                balance = remainingBalance;
//                System.out.println(Thread.currentThread().getName() + " is attempting to withdraw...");
//                Thread.sleep(1000);
//                System.out.println(Thread.currentThread().getName() + " withdrew " + amount + " rs.");
//                Thread.sleep(1000);
//                System.out.println(balance + " rs" + " remained.");
//                while (true) System.out.println();
//            } catch (Exception e) {
//
//            }
//        } else {
//            System.out.println("Insufficient Balance!");
//        }
//    }
//
//}

// better is use Locks (extrinsic)