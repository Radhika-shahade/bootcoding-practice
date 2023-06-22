package casting;

import java.sql.SQLOutput;
//conversion lower data type to higher datatype is implicit casting
public class ImplicitCasting {
    public static void main(String[] args) {
        byte b= 22;
       int a= (int)b;
        System.out.println(a);

        int num =78;
//        long res =(long)num;
        System.out.println((long)num);

        char ch= 'a';   // it gives a Ascii value of a
        int val =(int)ch;
        System.out.println(val);

    }
}
