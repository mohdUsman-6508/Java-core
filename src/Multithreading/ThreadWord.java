package Multithreading;

public class ThreadWord extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Spelling check");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
