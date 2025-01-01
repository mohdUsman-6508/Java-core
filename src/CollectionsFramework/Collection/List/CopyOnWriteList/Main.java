package CollectionsFramework.Collection.List.CopyOnWriteList;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        "Copy on Write" means that whenever a write operation
//        like adding or removing an element
//        instead of directly modifying the existing list
//        a new copy of the list is created, and the modification is applied to that copy
//        This ensures that other threads reading the list while it's being modified are unaffected.
//        Read Operations: Fast and direct, since they happen on a stable list without interference from modifications.
//        Write Operations: A new copy of the list is created for every modification.
//        The reference to the list is then updated so that subsequent reads use this new list.
//               notepad--> notepad-copy
//        use it when you perform READ operation more

        List<String> list = new CopyOnWriteArrayList<>(Arrays.asList("apple", "orange", "mango"));

        for (String item : list) {
            System.out.println(item);
            if (item == "orange") list.add("Kiwi");
        }

        System.out.println(list);

        List<String> l = new CopyOnWriteArrayList<>(Arrays.asList("APPLE", "MANGO", "ORANGE", "KIWI", "GRAPE"));

        System.out.println(l);
        Thread t1 = new Thread(() -> {
            for (String s : l) System.out.println(s);
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                l.add("Mango" + i);
                l.remove(i);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(l);
    }
}

// Notes:

// In arrayList we cannot WRITE and READ concurrently it will give 'ConcurrentModificationError'
// In CopyOnWriteArrayList , we can do READ and WRITE operation simultaneously

//Remember:
// In JAVA when we are looping through ArrayList it needs 'STABLE' picture of ArrayList
// so if we try to modify the arraylist while looping it then it will give the ConcurrentModificationError

// To overcome this we introduce you to our ' CopyOnWriteArrayList '