package Generics.Wildcard;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        List<? extends Number> l1= Arrays.asList(1,3.14,5);
//        l1.add(1); // cannot add because don't know ? value goint in, and it has upperbound so not extend object

        List<? super Integer> l1= Arrays.asList(1,3.14,5);
//        l1.add(3); // now we can add, it has lowerbound

       display(l1);


    }

    static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }
    static void display(List<? super Integer> list) {

        for (Object o : list) {
            System.out.println(o);
        }

    }
}
