package arryofobjects.Shape;

public class Rectangle extends Shapes{
    private int height;
    private int width;
    public Rectangle(String colour,int width, int height)
    {
        super(colour);
        this.height=height;
        this.width=height;

    }
    public void draw()
    {
        System.out.println("Drawing a rectangle of color: " + colour + ", width: " + width + ", height: " + height);
    }


}
