package Generics.Methods;

public class Main {

    public static void main(String[] args) {

        Integer[] nums = {1, 2, 3, 4, 5};
        String[] str = {"Hello", "I", "am", "Java", "!"};

        printArr(nums);
        printArr(str);

        display("Hola");
        display(1);
        display(3.14);
    }


    //Generic method
    static <T> void printArr(T[] arr) {
        System.out.println("................................................");
        for (T val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
        System.out.println("................................................");
    }

    static <T> void display(T value) {
        System.out.println("Generic type display: " + value);
    }

    static void display(int value) {
        System.out.println("Integer type display: " + value);
    }

}
