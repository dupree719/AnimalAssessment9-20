package payroll;

public class SalaryEmployee extends Employee{

    private double basePay;

    public SalaryEmployee(String name) {
        super(name);
    }

    @Override
    public void printPayCheck() {
        System.out.println(basePay);
    }
}
