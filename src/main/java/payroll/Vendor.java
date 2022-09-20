package payroll;

public class Vendor implements IPay{

    @Override
    public void printPay() {
        System.out.println("Now paying vendor");
    }
}
