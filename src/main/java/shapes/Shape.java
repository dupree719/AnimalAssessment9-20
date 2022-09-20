package shapes;

public abstract class Shape {
        //Access private attributes by using getters&setters
    private double side;

    public void calcArea(){
        System.out.println("Calculating area of shape...");
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public abstract void printSide(Shape shape){

    }
}
