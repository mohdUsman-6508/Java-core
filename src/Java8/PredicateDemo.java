package Java8;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        // Predicate --> Functional interface (Boolean valued function)
        // holds a condition
        // has operations-> and, or ,negate etc.

        Predicate<Integer> isEven = x -> x % 2 == 0;
        Predicate<Integer> isPositive = x -> x > 0;

        Predicate<Integer> evenPositive = isEven.and(isPositive);

        System.out.println(evenPositive.test(-2));

        Predicate<String> isHero = str -> str.toLowerCase().contains("hero");


        System.out.println(isEven.test(2));
        System.out.println(isEven.test(11));

        System.out.println(isHero.test("superHero"));
        System.out.println(isHero.test("superman"));

    }
}
