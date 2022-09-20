package assessment;

public abstract class Pet extends Animal implements MakeNoise{
    private String name;

    public Pet(String name) {
        super(name);
        this.name = name;
    }

}
