package Java8;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionDemo {
    public static void main(String[] args) {

        // Function --> work for you
        Function<Integer, Integer> doubleIt = x -> x * 2;
        Function<Integer, Integer> tripleIt = x -> x * 3;

        Function<Integer, Integer> dt = doubleIt.andThen(tripleIt);

        System.out.println(doubleIt.apply(3));
        System.out.println(tripleIt.apply(5));

        System.out.println(dt.apply(3));

        Function<Integer, Integer> identity = Function.identity();
        System.out.println(identity.apply(2));


        UnaryOperator<Integer> a = x -> x * x;
        BinaryOperator<Integer> b = (x, y) -> x + y;

    }
}
