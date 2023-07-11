package src.main.java.leetcodequestions;

public class CountTheDigitsThatDivideANumber {
    public static int countingNumber(int num)
    {
        int n=num;
        int count=0;
        while(num>0)
        {
            int c=num%10;
            if(n%c==0)
            {
                count++;
            }
            num=num/10;
        }
        return count;

    }

    public static void main(String[] args) {
       int ans= countingNumber(7);
        System.out.println(ans);
    }

}
