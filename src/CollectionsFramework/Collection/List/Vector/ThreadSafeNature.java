package CollectionsFramework.Collection.List.Vector;

import java.util.ArrayList;
import java.util.Vector;

public class ThreadSafeNature {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(2000);
        //ArrayList is not Thread Safe, it can corrupt the data

        Vector<Integer> list = new Vector<>();
        // It has USP which is Thread Safe

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(list.size());
    }
}
