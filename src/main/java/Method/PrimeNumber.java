package Method;

public class PrimeNumber {
    public static void checkingNumber(int num)
    {
        if((num% 1==0)&&(num%2!=0))
        {
            System.out.println( num+" number is a prime number ");
        }
        else {
            System.out.println(+ num +" number is not  a prime number");
        }
    }

    public static void main(String[] args) {
        checkingNumber(7);
    }

}
