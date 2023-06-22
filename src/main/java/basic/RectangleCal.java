package basic;

public class RectangleCal {
    double width= 5.6;
    double height=8.5;
    public void area()
    {
        double area= width*height;
        System.out.println("Area of rectangle is:"+area);
    }
    public void perimeter()
    {
        double f=2*(width+height);
        System.out.println("perimeter of rectangle is:"+f);
    }
    public static void main(String[]args)
    {
        RectangleCal obj= new RectangleCal();
        obj.area();
        obj.perimeter();
    }
}
