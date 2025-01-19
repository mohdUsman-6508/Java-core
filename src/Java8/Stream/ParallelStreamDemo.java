package Java8.Stream;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamDemo {
    public static void main(String[] args) {

        /*
        A type of stream that enables parallel processing of elements
        Allowing multiple threads to process parts of the stream simultaneously
        This can significantly improve performance for large data sets
        workload is distributed across multiple threads
         */

        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(50000).toList();
        List<Long> list1 = list.stream().map(ParallelStreamDemo::fact).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with sequential stream: " + (endTime - startTime) + " ms");

        long startTime1 = System.currentTimeMillis();
        List<Long> list12 = list.parallelStream().map(ParallelStreamDemo::fact).toList();
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken with parallel stream: " + (endTime1 - startTime1) + " ms");

        System.out.println(fact(5));

        /*
        Parallel streams are most effective for CPU-intensive or large datasets where datasets are (independent)
        They may add overhead for simple tasks or small datasets
         */
    }

    static long fact(int num) {
        if(num==0) return 1;
        long fact=1;
        for(int i=2;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
}
