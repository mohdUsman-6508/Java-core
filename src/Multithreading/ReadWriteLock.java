package Multithreading;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock {

    private int count = 0;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    // it will not block unnecessarily reading of resources, when multiple threads are trying to access
    // provided no thread is writing at the moment

    ReentrantReadWriteLock.ReadLock readLock = lock.readLock();
    ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();

    public void writeCount() {
        writeLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is writing...");
            Thread.sleep(500);
            count++;
        } catch (InterruptedException e) {
            System.out.println(e);
            Thread.currentThread().interrupt();
        } finally {
            writeLock.unlock();
        }
    }

    public int getCount() {
        readLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is reading..." + count);
            return count;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            readLock.unlock();
        }
        return 0;
    }
}
