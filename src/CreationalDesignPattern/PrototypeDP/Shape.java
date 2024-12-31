package CreationalDesignPattern.PrototypeDP;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape implements Cloneable {

    private String color;
    private double x, y;

    private List<String> type = new ArrayList<>();

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

//    static {
//        try {
//            System.out.println("One time expesive operation...");
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public String getColor() {
        return color;
    }

    public Shape setColor(String color) {
        this.color = color;
        return this;
    }

    public double getX() {
        return x;
    }

    public Shape setX(double x) {
        this.x = x;
        return this;
    }

    public double getY() {
        return y;
    }

    public Shape setY(double y) {
        this.y = y;
        return this;
    }

    public String renderShape() {
        try {
            System.out.println("Rendering...");
            Thread.sleep(5000);
            System.out.println("Rendered!!!");
        } catch (Exception e) {
            throw new RuntimeException();
        }

        return "Very expensive operation.";
    }

    public abstract double getArea();

    public Object clone() throws CloneNotSupportedException {
//        return super.clone();

        //deep cloning
        Shape shape = new Shape() {
            @Override
            public double getArea() {
                return 0;
            }
        };

        shape.setX(this.x);
        shape.setY(this.y);
        shape.setColor(this.getColor());

        for (String t : this.getType()) {
            shape.getType().add(t);
        }


        return shape;

    }
}
