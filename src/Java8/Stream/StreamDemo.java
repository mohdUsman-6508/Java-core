package Java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        // How to use streams
        // Source, intermediate operation & terminal operation

        List<Integer> nums= Arrays.asList(1,2,3,4,5);

        //count the number of even nums
        //without streams

        int count=0;
        for(int val:nums){
            if(val%2==0) count++;
        }
        System.out.println(count);

        // using streams
        long c=nums.stream().filter(x->x%2==0).count();
        System.out.println(c);

        // Creating Streams
        //1. from collections
        Stream<Integer> l1=nums.stream();

        //2. from arrays
        String[] arr={"a","b","c"};
        Stream<String> stringStream = Arrays.stream(arr);

        //3. using Stream.of()
        Stream<String> stream2=Stream.of("a","b");

        //4 Infinite stream
        Stream<Integer> generate = Stream.generate(() -> 1);

        List<Integer> integerList = Stream.iterate(1, x -> x + 1).limit(10).collect(Collectors.toList());
        System.out.println(integerList);
    }
}
