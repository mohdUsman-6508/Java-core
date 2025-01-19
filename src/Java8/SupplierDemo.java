package Java8;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        //BiFunction, BiConsumer, BiPredicate

        Supplier<String> sayHello = () -> "Hello!";
        Supplier<Integer> random = () -> {
            int x = (int) Math.round(Math.random() * 10);
            return x;
        };

        System.out.println(sayHello.get());
        System.out.println(random.get());


    }
}
