package exceptionhandling.handlingexception;

public class Test {
    public static void main(String[] args) {
        int i=25;
        int k=0;
        int j=0;
        try {
            j=i/k;
        }
        catch (ArithmeticException e)
        {
            System.out.println(" catch block is executing ");
            j=9;
        }
        System.out.println(j);
        System.out.println("Last line of code");
    }
}
