package src.main.java.casting;

public class Narrowing {
    public static void main(String[] args) {
        int a=-5;
        int m=-a;
        System.out.println(m);
        long gh= 12355457965353987l;
        int f= (int )gh;
        System.out.println(f);

        double s= 12.777;
       byte b=(byte)s;
         int i=(int)s;
        // direct cast from double to char is not allowed
        // in Java because they are different types and have different representations.
          char c=(char)i;
          //double to byte
        System.out.println(b);
        //byte to int
        System.out.println(i);
        //int to char
          System.out.println(c);
          //char to int
          char ch='2';
           int t=ch;
           //it will give me ascii value
        System.out.println(t);
           int g= Character.getNumericValue(ch);
           //it will give me int number
        System.out.println(g);
        //string value to double
        String name= "124.45";
        double ds= Double.valueOf(name);
        System.out.println(ds);
        double value= Double.parseDouble(name);
        System.out.println(value);
        //String to double gives NumberFormatException
        String ss="school";
       double d=Double.valueOf(ss);
        System.out.println(d);
        int val=Integer.valueOf(ss);
        System.out.println(val);



    }
}
