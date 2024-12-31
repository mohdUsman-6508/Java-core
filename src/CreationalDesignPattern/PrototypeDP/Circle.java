package CreationalDesignPattern.PrototypeDP;

import java.util.ArrayList;
import java.util.List;

public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
