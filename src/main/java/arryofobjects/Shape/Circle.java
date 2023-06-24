package arryofobjects.Shape;

public class Circle extends Shapes {

    private double radius;

    public Circle(String colour, double radius) {
        super(colour);
        this.radius = radius;

    }

    public void draw() {

        System.out.println("Drawing a circle of colour " + colour + " radius: " + radius);
    }
}
