package shapes;

public class Circle extends Shape {
    //formula = pi*r*r


    @Override
    public void calcArea(){
        System.out.println(Math.PI * this.getSide() * this.getSide());
    }
    @Override
    public void printSide(Shape theShapeYouGiveMeInMain){
        System.out.println("Print side of circle" + this.getSide());
    }
}
