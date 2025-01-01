package CollectionsFramework.Collection.List.Vector;

import java.util.Arrays;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> marks = new Vector<>(5, 5);
        marks.add(1);
        marks.add(2);
        marks.add(3);
        marks.add(4);
        marks.add(5);
        marks.add(6);
        marks.remove(Integer.valueOf(2));
        marks.remove(0);
        System.out.println(marks.contains(6));
        for (int val : marks) System.out.print(val + " ");

        System.out.println(marks);
        System.out.println(marks.capacity());

        Vector<Double> cgpa = new Vector<>(Arrays.asList(3.3, 2.5, 4.2));
        System.out.println(cgpa);
        cgpa.set(2, 3.74);
        System.out.println(cgpa);
    }
}
