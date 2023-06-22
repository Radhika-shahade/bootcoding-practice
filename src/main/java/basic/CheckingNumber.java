package basic;

public class CheckingNumber {
    public void m1(int num)
    {
        if( (num%2==0)&&(num>0)) //15
        {

                System.out.println("The number is positive even number");
        }
        if( (num%2!=0)&&(num>0)){
                System.out.println(" The number is positive odd Number");
            }
        if((num%2==0)&&(num<0))
        {
            System.out.println(" The number is negative even number ");
        }
        if((num%2!=0)&&(num<0)) {
            System.out.println("The number is negative odd number");
        }
    }

    public static void main(String[] args) {
        CheckingNumber cv= new CheckingNumber();
        cv.m1(-13);

    }
}
