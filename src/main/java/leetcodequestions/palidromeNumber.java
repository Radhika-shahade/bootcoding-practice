package leetcodequestions;

public class palidromeNumber {
    public boolean checkNumber(int num)
    {
        int reverse= 0;
        int temp=num;

        while(num>0)
        {
         int  remainder= num%10;
           reverse=reverse*10+remainder;
           num=num/10;
        }
        if(temp==reverse)
        {
           return true;
        }
        return false;
    }

    public static void main(String[] args) {
        palidromeNumber ispalidome= new palidromeNumber();
        System.out.println(ispalidome.checkNumber(-121));




    }


}
