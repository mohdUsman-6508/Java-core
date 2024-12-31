package CreationalDesignPattern.PrototypeDP;

import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle();
        circle.setColor("red").setX(2).setY(3);
        circle.renderShape();
        List<String> t = circle.getType();
        t.add("solid");
        t.add("hollow");
        t.add("solidsolid");

        System.out.println(t);

        Shape circle2 = (Shape) circle.clone(); //shallow copy
        circle2.setColor("yellow").setX(0).setY(0);
        List<String> t1=circle2.getType();
        t.remove("solidsolid");
        System.out.println(t);
        System.out.println(t1);


//        System.out.println(circle.getColor());
//        System.out.println(circle2.getColor());

    }
}
