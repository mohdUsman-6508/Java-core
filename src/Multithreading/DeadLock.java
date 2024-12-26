package Multithreading;

class Pen {
    public synchronized void writeWithPenAndPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName() + " is trying to access paper");
        paper.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println("Pen has finished writing");
    }
}

class Paper {
    public synchronized void writeWithPenAndPaper(Pen pen) {
        System.out.println(Thread.currentThread().getName() + " is trying to get pen...");
        pen.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println("Peper is free to write");
    }
}


class Task1 implements Runnable {
    Paper paper;
    Pen pen;

    public Task1(Paper paper, Pen pen) {
        this.paper = paper;
        this.pen = pen;
    }

    @Override
    public void run() {
        //to resolve DEADLOCK use Lock Ordering
//        synchronized (pen) {
//            //first lock the pen then lock the paper (locking in order)
//            paper.writeWithPenAndPaper(pen);
//        }

        paper.writeWithPenAndPaper(pen);
    }
}

class Task2 implements Runnable {
    Paper paper;
    Pen pen;

    public Task2(Paper paper, Pen pen) {
        this.paper = paper;
        this.pen = pen;
    }

    @Override
    public void run() {
        synchronized (paper){
            pen.writeWithPenAndPaper(paper);
        }
//        pen.writeWithPenAndPaper(paper);
    }
}

public class DeadLock {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Task1 t1 = new Task1(paper, pen);
        Task2 t2 = new Task2(paper, pen);

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
//        thread1 runs Task1 (locks Paper first, then tries to lock Pen).
//        thread2 runs Task2 (locks Pen first, then tries to lock Paper).
//
//        Thread 1 locks Paper and tries to lock Pen.
//        Thread 2 locks Pen and tries to lock Paper.
//        Both threads are stuck waiting for each other, causing a deadlock.

        thread1.start();
        thread2.start();
    }
}
