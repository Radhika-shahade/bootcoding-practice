package basic;

public class Triangle {
    public double calculation(double base, double height)
    {
        double result= (base*height)/2;
        System.out.println(+result);
        return result;
    }

    public static void main(String[] args) {
        Triangle tv= new Triangle();
       tv.calculation(3,5);
    }
}
