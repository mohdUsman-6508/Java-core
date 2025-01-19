package CollectionsFramework.Collection.Set;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {

        /*
        Thread-Safe
        Copy-On-Write Elements
        No Duplicate Elements
        Iterators Do not reflect Modifications
         */

        CopyOnWriteArraySet<Integer> set=new CopyOnWriteArraySet<>();
        //iterate on stable copy
        ConcurrentSkipListSet<Integer> set1=new ConcurrentSkipListSet<>();
        //it is weakly consistent
        // it is not necessary that it will reflect the change or not
        // in loop

    }

    //use copyonwritearrayset when doing read intensive work, iterate frequently
    //use concurrentskiplistset when doing write intensive work
}
