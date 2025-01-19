package Java8.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1);

        //toList
        List<Integer> list1 = Stream.iterate(1, x -> x + 2).limit(10).toList();
        System.out.println(list1);

        // forEach
        list.forEach(x -> System.out.print(x + " "));
        list.forEach(System.out::println);

        //reduce : combines elements to produce a single result
        Optional<Integer> reduce = list.stream().reduce((x, y) -> x + y);
        System.out.println(reduce);

        //count

        // anyMatch, allMatch, noneMatch --> shortcircuit terminal

        System.out.println(list.stream().anyMatch(x -> x % 2 == 0));
        System.out.println(list.stream().noneMatch(x -> x > 1));

        // Examples
        List<String> list2 = Arrays.asList("Newton", "Faraday", "Edison", "Tesla", "Khwarizmi");

        // find those name whole length is > 6
        System.out.println(list2.stream().filter(x -> x.length() > 6).toList());

        // square and sort numbers
        System.out.println(list.stream().map(x -> x * x).sorted().toList());

        // find sum of list
        System.out.println(list.stream().reduce((x, y) -> x + y).get());

        String sentence = "Hello world";

        System.out.println(sentence.chars().filter(x -> x == 'l').count());

        // min/max
        System.out.println("min: " + Stream.of(11, 33, 22, 44).min(Comparator.naturalOrder()).get());
        System.out.println("max: " + Stream.of(11,33,22,44).max((o1,o2)->o1-o2).get());

        // stateful and stateless operation
        // e.g. stateless: map operate on one value at a time it does not care about the others
        // stateful: distinct has to know about other elements present as well

        // Streams cannot be reused after a terminal operation has been called

        // forEachOrdered for parallel stream

        Stream<Integer> stream=list.stream();
        stream.forEach(System.out::println);

        List<Integer> list3 = stream.map(x -> x + 1).toList(); // exception
//        stream has already been operated upon or closed
    }


}
