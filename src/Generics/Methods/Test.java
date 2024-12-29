package Generics.Methods;

enum Operation {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    public <T extends Number> double apply(T a, T b) {
        switch (this) {
            case ADD -> {
                return a.doubleValue() + b.doubleValue();
            }
            case SUBTRACT -> {
                return a.doubleValue() - b.doubleValue();
            }
            case MULTIPLY -> {
                return a.doubleValue() * b.doubleValue();
            }
            case DIVIDE -> {
                try {
                    return a.doubleValue() / b.doubleValue();
                } catch (ArithmeticException e) {
                    System.out.println(e);
                }
            }
            default -> throw new AssertionError("Unknown type operation" + this);
        }

        return -1;
    }
}

public class Test {
    public static void main(String[] args) {

        double sum = Operation.ADD.apply(20, 5);
        System.out.println(sum);
        System.out.println(Operation.DIVIDE.apply(1,0));

    }
}
