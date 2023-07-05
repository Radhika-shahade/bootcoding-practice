package src.main.java.casting;

public class Widening {
    public static void main(String[] args) {
        //boolean byte char short int long float double
        byte b= 20;
        short s=b;
        float f= b;
        double d= b;
        System.out.println(b);
        System.out.println(s);
        System.out.println(f);
        System.out.println(d);
    }
}
