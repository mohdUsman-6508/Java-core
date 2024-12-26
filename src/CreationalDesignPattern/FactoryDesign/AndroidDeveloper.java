package CreationalDesignPattern.FactoryDesign;

public class AndroidDeveloper implements Employee {

    public int salary() {
        System.out.println("This is Android Developer");
        return 100000;
    }
}
