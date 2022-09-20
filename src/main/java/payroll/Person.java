package payroll;

public abstract class Person extends Object{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
    //abstract methods have no body, end with semi-colon
    //Must be implemented by subclasses
    public abstract void printPayCheck();


}
