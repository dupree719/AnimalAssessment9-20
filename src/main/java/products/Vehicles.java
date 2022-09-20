package products;

public abstract class Vehicles extends Product implements IRideable{

    public Vehicles(String name) {
        super(name);
    }

    abstract void printRideExperience();
}
