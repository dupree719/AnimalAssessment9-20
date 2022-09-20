package shapes;

public class Rect extends Shape {
    //formula = l*w

        private double width;

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void calcArea(){
        System.out.println(this.getSide() * this.width);
    }

}
