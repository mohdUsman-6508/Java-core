package CreationalDesignPattern.FactoryDesign;

public class WebDeveloper implements Employee {

    public int salary() {
        System.out.println("This is Web Developer");
        return 80000;
    }
}
