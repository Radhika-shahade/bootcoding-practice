package Method;

public class CheckingNumber {
    public static void numberIsNegativeOrPositiveOrZero(int num)
    {
        if(num>0)
        {
            System.out.println( +num+" is positive number");
        }
        if(num<0)
        {
            System.out.println(+num+" is negative number");
        }
        if(num==0)
        {
            System.out.println("Number is zero");
        }
    }

    public static void main(String[] args) {
        numberIsNegativeOrPositiveOrZero(5);
    }
}
