package Generics.Interfaces;

public class Main {
    public static void main(String[] args) {
        GenericInterface<String> gc=new GenericClassWithGenericInterface<>();
        gc.addItem("Apple");
        System.out.println(gc.getItem());

        GenericClassWithGenericInterface<Integer> gci=new GenericClassWithGenericInterface<>();
        gci.addItem(1);
        System.out.println(gci.getItem());
    }
}
