package Java8.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {

        //1. Collecting to a List
        List<String> list = Arrays.asList("Newton", "Faraday", "Einstein", "Khwarizmi", "Ramanujan");
        List<String> k = list.stream()
                .filter(name -> name.startsWith("K"))
                .collect(Collectors.toList());
        System.out.println(k);

        //2 . Collecting to a set

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 4, 3, 2, 1);
        Set<Integer> collect = list1.stream().collect(Collectors.toSet());

        //3. Collecting to a specific Collection
        list.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));

        //4. Joining Strings
        String collect1 = list.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(collect1);

        //5. Summarizing Data
        // Generate statistical summary(count,sum,min,avg,max)

        IntSummaryStatistics collect2 = list1.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println(collect2.getAverage());

        // Grouping elements
        System.out.println(list.stream().collect(Collectors.groupingBy(String::length)));

        //pratitioning elements
        System.out.println(list.stream().collect(Collectors.partitioningBy(x -> x.length() > 7)));

        // Mapping and collecting
        System.out.println(list.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList())));

    }
}
