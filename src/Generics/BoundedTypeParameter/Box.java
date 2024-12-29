package Generics.BoundedTypeParameter;

import java.awt.print.Printable;

public class Box<T extends Number & Printable> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
