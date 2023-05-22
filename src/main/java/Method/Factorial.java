package Method;

public class Factorial {

    public static void getFactorial(int num)
    {
        int factorial=1;
       while(num>0)
       {
           factorial= factorial*num;
           num--;
       }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        getFactorial(3);

    }

}
