package Generics.BoundedTypeParameter;

public class Main {

    public static void main(String[] args) {
        MyNumber mn=new MyNumber(1);

        Box<MyNumber> b=new Box<>();
        System.out.println(mn.intValue());

//        Box<String> bx=new Box<>();
//        Type parameter 'java.lang.String• is not within its bound; should extend •java.lang.Number•

    }
}
