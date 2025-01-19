package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerDemo {
    public static void main(String[] args) {
        // only take, no give
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(1);

        List<Integer> list = Arrays.asList(1, 2, 3);

        Consumer<List<Integer>> printList = x -> {
            for (int i : x) {
                System.out.print(i + " ");
            }
        };

        printList.accept(list);

    }

}
