package CreationalDesignPattern.AbstractFactoryDP;

public class WebDevFactory implements EmployeeAbstractFactory {

    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
