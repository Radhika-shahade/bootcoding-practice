package Method;

public class UsingBuiltInMathFunction {

    public void areaOfHexagon(double s)
    {
        double area;
        area= (Math.pow(s,2)*6 )/ (Math.tan(Math.PI/6)*4);
//                                              Area of a hexagon = (6 * s^2)/(4*tan(π/6))
        System.out.println(area);
    }

    public static void main(String[] args) {
        UsingBuiltInMathFunction result = new UsingBuiltInMathFunction();
        result.areaOfHexagon(6);

    }

}
