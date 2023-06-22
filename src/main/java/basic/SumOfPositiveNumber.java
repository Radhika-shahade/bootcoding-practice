package basic;

public class SumOfPositiveNumber {
    int result=0;
    public int m1(int num[])
    {

        for(int i=0;i<num.length;i++)
        {
            if(num[i]>0)
            {
                result=result+num[i];
                System.out.println(+result);
            }
        }
            return result;

    }

    public static void main(String[] args) {
int num[]={10,-20,-2,-2};
        SumOfPositiveNumber obj=new SumOfPositiveNumber();
        obj.m1(num);
    }

}
