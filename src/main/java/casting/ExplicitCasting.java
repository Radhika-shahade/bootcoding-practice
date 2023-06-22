package casting;
//conversion of higher order data type to lower data type
//chances of data loss
public class ExplicitCasting {
    public static void main(String[] args) {
        float f= 78.87f;  //4 byte
        short res =(short)f;
        System.out.println(res); //res=78 data loss


        int i=130;
        byte val =(byte)i; // -128 to 127 is range
        System.out.println(val); //-126 bcoz after 127 it reset up to  3 times(-128,-127,-126 )


        short s=156;
        byte n=(byte)s;
        System.out.println(n);

    }
}
