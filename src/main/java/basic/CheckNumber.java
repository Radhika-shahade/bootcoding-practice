package basic;

public class CheckNumber {
    public void m1(int a, int b)
    {
        if((a==10||b==10)||(a+b==10))
        {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        CheckNumber obj= new CheckNumber();
        obj.m1(2,10);
    }
}
