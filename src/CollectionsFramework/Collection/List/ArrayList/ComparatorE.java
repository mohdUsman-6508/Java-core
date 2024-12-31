package CollectionsFramework.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorE {

//    class MyStudentComparator implements Comparator {
//

    /// /        public int compare(Student o1, Student o2) {
    /// /            if (o1.getCgpa() - o2.getCgpa() > 0) {
    /// /                return 1;
    /// /            } else if (o1.getCgpa() - o2.getCgpa() < 0) {
    /// /                return -1;
    /// /            } else {
    /// /                return 0;
    /// /            }
    /// /        }
//
//    }

    static class CustomSort implements Comparator<Integer> {
        public int compare(Integer a, Integer b) {
            return b - a;
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student("Alice", 3.65);
        Student s2 = new Student("Bob", 4.12);
        Student s3 = new Student("Charlie", 3.65);

        List<Student> list = new ArrayList<>(List.of(s1, s2, s3));

        List<Integer> marks = new ArrayList<>(List.of(1, 2, 4, 2, 3));

        marks.sort(new CustomSort());
        marks.sort((a, b) -> {
            return a - b;
        });

        for (int val : marks) System.out.print(val + " ");
        System.out.println();

        list.sort((stu1, stu2) -> {

            if (stu2.getCgpa() - stu1.getCgpa() > 0) {
                return 1;
            } else if (stu2.getCgpa() - stu1.getCgpa() < 0) {
                return -1;
            } else {
//                return 0;
                return stu1.getName().compareTo(stu2.getName());
            }
        });


        for (Student s : list) {
            System.out.println(s.getName() + " " + s.getCgpa());
        }

    }
}

class Student {
    private String name;
    private double cgpa;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}
