package Java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveStreamD {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(list);

        System.out.println(IntStream.range(1, 5).boxed().collect(Collectors.toList()));
        System.out.println(IntStream.rangeClosed(1, 5));

        DoubleStream doubles = new Random().doubles(5);
        System.out.println(doubles.sum());
    }
}
