package Java8.Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {
        // Intermediate operations transform a stream into another stream
        // They are lazy, means they don't execute until a terminal operation is invoked.

        //1. filter
        List<String> list = Arrays.asList("Newton", "Faraday", "Edison");
        long count = list.stream().filter(x -> x.startsWith("N")).count();
        System.out.println(count);

        //2. map
        Stream<String> stringStream = list.stream().map(String::toUpperCase);
        System.out.println(stringStream);

        //3. sorted
        Stream<String> sorted = list.stream().sorted();

        //4. distinct
        System.out.println(list.stream().filter(x -> x.startsWith("N")).distinct().count());

        //5. limit
        System.out.println(Stream.iterate(1, x -> x + 1).limit(10).count());

        //6. skip
        System.out.println(Stream.iterate(1, x -> x + 1).skip(5).limit(10).collect(Collectors.toList()));

        //7. peek
        // performs an action on each element as it is consumed
        Stream.iterate(1, x -> x + 1).skip(10).limit(100).peek(System.out::println).count();

        //flatMap
        // Handle streams of collection, list, array where each element is itself a collection

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "mango"),
                Arrays.asList("kiwi", "grape")
        );

        System.out.println(listOfLists.get(1).get(1));

        System.out.println(listOfLists.stream().flatMap(x->x.stream()).map(String::toUpperCase).toList());


    }
}
