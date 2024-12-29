package Generics.Class;

public class Main {
    public static void main(String[] args) {
//        Box<Integer> box=new Box<>();
//        box.setValue(1);
//        box.setValue(3);
//        System.out.println(box.getValue());

        GenericClass<String, Integer> gc = new GenericClass<>("Apple", 2);
        System.out.println(gc.getKey());
        System.out.println(gc.getValue());
    }
}
