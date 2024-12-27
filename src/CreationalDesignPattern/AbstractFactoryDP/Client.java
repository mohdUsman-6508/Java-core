package CreationalDesignPattern.AbstractFactoryDP;

public class Client {
    public static void main(String[] args) {

        Employee emp1 = EmployeeFactory.getEmployee(new WebDevFactory());
        emp1.getName();

        Employee emp2 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        emp2.getName();

        Employee emp3 = EmployeeFactory.getEmployee(() -> new GameDeveloper());
        emp3.getName();

    }
}
