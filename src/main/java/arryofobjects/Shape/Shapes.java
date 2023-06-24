package arryofobjects.Shape;

public class Shapes {
    protected String colour;
    public Shapes(String colour)
    {
        this.colour=colour;
    }
    public void draw()
    {
        System.out.println("Drawing a shape of colour: " + colour);
    }


}
