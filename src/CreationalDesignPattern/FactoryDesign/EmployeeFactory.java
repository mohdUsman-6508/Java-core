package CreationalDesignPattern.FactoryDesign;

public class EmployeeFactory {

    private Employee emp;

    public static Employee getEmployee(String empType) {
        if (empType.trim().equalsIgnoreCase("WEB DEVELOPER")) {
            return new WebDeveloper();
        } else if (empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
            return new AndroidDeveloper();
        } else {
            return null;
        }
    }
}
