package payroll;

public class HourlyEmployee extends Employee{
    private double hourlyPay;
    private double hoursWorked;

    public HourlyEmployee(String name) {
        super(name);
    }

    @Override
    public void printPayCheck() {
        System.out.println(hourlyPay * hoursWorked);

    }

}
