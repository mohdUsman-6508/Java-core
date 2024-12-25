package Multithreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(Thread.currentThread().getName());

        Thread thread1 = new ThreadWord();
        thread1.start();

        RunnableWord rw = new RunnableWord();
        Thread thread2 = new Thread(rw);
        thread2.start();

    }
}
