package Generics.Class;

public class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

/// ////////////////////////////////////////////////////////////////////////
class BoxGC {

    /// Generic Constructor
    public <T> BoxGC(T value) {
        System.out.println("Value is: " + value);
    }

    public static void main(String[] args) {
        BoxGC b = new BoxGC(1);
        BoxGC c = new BoxGC("Hello!");

    }
}
