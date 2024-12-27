package Multithreading;

public class ThreadUsingLambdaExpression {

    public static void main(String[] args) {
        //Thread without Lambda Expression so verbose
        Runnable runnable1 = new Runnable() {
            public void run() {
                System.out.println("This is run function and Runnable is a functional interface, so I can use Lambda Expression for it's implementation");
            }
        };
        Thread hardWork=new Thread(runnable1);
        hardWork.start();

        //Thread using Lambda Expression
        Runnable runnable2 = () -> {
            System.out.println("I am using Lambda expression");
        };

        Thread task1 = new Thread(runnable2);
        task1.start();

        //////////////////////////////////////////////////////////////////////////////////////
        //Creating Thread Directly no need of Implementation class,Anonymous inner class
        Thread sayHello = new Thread(
                // This is an Implementation class of Runnable (man ki aankho se dekho)
                () -> {
                    System.out.println("Hello");
                });
        sayHello.start();
        ////////////////////////////////////////////////////////////////////////////////////////

        //Another Example
        FunctionalInterfaceExample simple = () -> System.out.println("This is more clean code");
        simple.info();
    }
}
