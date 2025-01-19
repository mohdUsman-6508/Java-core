package Java8;

/*
 Java 8 --> minimal code, functional programing
 Java 8 --> lambda expression, Streams, Date & Time API

 //lambda expression is an anonymous function (No-> name,return type,access modifier)
 */

public class Java8Demo {
    public static void main(String[] args) {

        //before java 8
        //s1
        MathOperation add = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        // so much code to write for a simple function

        // after java 8

        MathOperation mentosAdd = (int a, int b) -> {
            return a + b;
        };

        //s2
        MathOperation superAdd = (a, b) -> a + b;
        // you can see the difference yourself compare s1 and s2
        MathOperation sub = (a, b) -> a - b;

        System.out.println(superAdd.operate(2,4));
        System.out.println(sub.operate(1,2));

    }
}

@FunctionalInterface
// we can hold lambda expression in a functional interface
        // so this treatment of function as a variable is functional programming kinda
interface MathOperation {
    int operate(int a, int b);
}
