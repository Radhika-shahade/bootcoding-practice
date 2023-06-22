package assignmentspractice;

public class Swap {
    public void swappingNumber(int a, int b)
    {
        //by using variable
        int c=a;
         a=b;
         b=c;
        System.out.println(a);
        System.out.println(b);

        //without using extra variable

        a=a+b;  //2+4=6
        b=a-b;   //6-4=2
        a=a-b;  //6-2=4

        //using multiply and division

        a=a*b; //  4*2=8
        b=a/b; //  8/2=4
        a=a/b; //  8/4=2

    }


    public static void main(String[] args) {
        Swap obj= new Swap();
        obj.swappingNumber(2,4);
    }

}
