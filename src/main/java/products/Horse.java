package products;

public class Horse extends Vehicles{

    public Horse(String name) {
        super(name);
    }

    @Override
    public void printProductName() {
        System.out.println(this.getName());
    }
    @Override
   public void printRideExperience();{
        System.out.println("Gallops");
    }

    @Override
    public void printRideExp() {

    }
}
