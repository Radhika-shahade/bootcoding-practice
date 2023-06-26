package practiceprograms;

public class FindingNumber {
    public void m1(int num)
    {
        if(num%2==0)
        {
            if(num>0)
            {
                System.out.println(+num +" is positive even number" );
            }
           else
            {
                System.out.println(+num +" is positive odd number");  ;
            }
            if(num%2==0)
            {
                if(num<0)
                {
                System.out.println( + num +"is negative even number");
            }
                else{
                    System.out.println(+num+  " is negative odd number");
                }
        }
    }
}

    public static void main(String[] args) {
        FindingNumber fv= new FindingNumber();
        fv.m1(10);
    }

    }
