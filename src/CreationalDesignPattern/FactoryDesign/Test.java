package CreationalDesignPattern.FactoryDesign;

public class Test {
    public static void main(String[] args) {
        Employee emp1 = EmployeeFactory.getEmployee("Android Developer");
        Employee emp2 = EmployeeFactory.getEmployee("Web Developer");

        System.out.println(emp1.salary());
        System.out.println(emp2.salary());
    }
}
