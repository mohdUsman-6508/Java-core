package CollectionsFramework.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparableExample {

    static class Student implements Comparable<Student> {
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

        @Override
        public String toString() {
            return this.name + ":" + this.cgpa;
        }

        @Override
        public int compareTo(Student o) {
            return Double.compare(o.cgpa, this.cgpa);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Issac", 3.75);
        Student s2 = new Student("Edison", 3.52);
        Student s3 = new Student("Faraday", 4.12);

        List<Student> l = new ArrayList<>(Arrays.asList(s1, s2, s3));
        l.sort(null);
        System.out.println(l);
    }
}
