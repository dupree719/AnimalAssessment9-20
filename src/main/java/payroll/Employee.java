package payroll;

public abstract class Employee extends Person {
    //Create attributes of employees that not every person has
    private double employeeId;

    public Employee(String name) {
        super(name);
    }
}
