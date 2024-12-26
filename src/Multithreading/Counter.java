package Multithreading;

public class Counter {
    private int count = 0;

    public  synchronized void upCount() { // whole method synchronize
        for (int i = 0; i < 10000; i++) {
            //this is ' critical section ' this should be accessible to a single thread at a time
//            synchronized(this){
//                count++;
//            } // specific block synchronized
            count++;

        }
    }

    public int getCount() {
        return count;
    }
}
