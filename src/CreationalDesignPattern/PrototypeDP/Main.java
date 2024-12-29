package CreationalDesignPattern.PrototypeDP;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Shape circle = new Circle();
        circle.setColor("red").setX(2).setY(3);
        circle.renderShape();

        Shape rectangle=new Rectangle();
        Shape circle2 = (Shape) circle.clone();
        circle2.setColor("yellow").setX(0).setY(0);

        System.out.println(circle.getColor());
        System.out.println(circle2.getColor());

        rectangle.renderShape();
    }
}
