package shapes;

public class ShapeFactory {
    //Create a method that takes shapes and prints out area of each shape
    public static void printAreaOfShape(Shape[] shapes){
        for(int x = 0; x < shapes.length; x++){
            shapes[x].calcArea();
        }

    }
    public static void main(String[] args) {
        //Create shapes

        Circle circle = new Circle();
        circle.setSide(7);
//        circle.calcArea();
        circle.printSide(circle);

        Rect rectangle = new Rect();
        rectangle.setSide(10);
        rectangle.setWidth(20);
//        rectangle.calcArea();

        Triangle triangle = new Triangle();


        //Create array of shapes
//        Shape[] shapes = new Shape[] {circleShape, rectangle};

//        printAreaOfShape(shapes);



    }
}
