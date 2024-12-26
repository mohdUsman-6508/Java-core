package Multithreading;

public class ThreadCommunication {

    static class SharedResource {

        int data;
        boolean hasData;

        public synchronized void consume() {
            while (!hasData) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            hasData = false;
            notify();
            System.out.println("Consume " + data);
        }

        public synchronized void produce(int value) {
            while (hasData) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            hasData = true;
            data = value;
            System.out.println("Produced " + value);
            notify();
        }
    }

    static class Producer implements Runnable {
        SharedResource producer;

        public Producer(SharedResource producer) {
            this.producer = producer;
        }

        public void run() {
            for (int i = 0; i < 5; i++) producer.produce(i);
        }
    }

    static class Consumer implements Runnable {
        SharedResource consumer;

        public Consumer(SharedResource consumer) {
            this.consumer = consumer;
        }

        public void run() {
            for (int i = 0; i < 5; i++) {
                consumer.consume();
            }
        }
    }

    public static void main(String[] args) {

        SharedResource SharedResource = new SharedResource();
        Thread consume = new Thread(new Consumer(SharedResource));
        Thread produce = new Thread(new Producer(SharedResource));

        consume.start();
        produce.start();

    }
}
