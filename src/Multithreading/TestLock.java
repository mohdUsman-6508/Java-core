package Multithreading;

public class TestLock {
    public static void main(String[] args) {
        BankAccountLocks bank = new BankAccountLocks(100);
        Runnable thread = new Runnable() {
            @Override
            public void run() {
                bank.withdraw(50);
            }
        };

        Thread t1 = new Thread(thread);
        Thread t2 = new Thread(thread);
        Thread t3=new Thread(thread);
        t1.start();
        t2.start();
        t3.start();
    }
}
