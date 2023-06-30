package src.main.java.Method;

public class ArmstrongNumber {
    public void armstrong(int num)
    {
        int org=num;
        int res=0;
        int sum=0;
        while(org!=0)
        {
           res=org%10;
           sum=sum+res*res*res;
            org=org/10;
        }

        if(num==sum)
        {
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("not an armstrong");
        }
    }

    public static void main(String[] args) {
        ArmstrongNumber sb= new ArmstrongNumber();
        sb.armstrong(153);
    }

}
