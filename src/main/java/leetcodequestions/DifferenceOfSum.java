package leetcodequestions;
//Difference Between Element Sum and Digit Sum of an Array

public class DifferenceOfSum {

    public int findingDifference(int []arr)
    {
        int result=0;
        int sum=0;
        int difference=0;
        int lastdigit=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        for(int i= 0; i<arr.length;i++)
        {
           while(arr[i]>0)
           {
             lastdigit=  arr[i]%10;
             result+=lastdigit;
             arr[i]=arr[i]/10;

           }
        }
        difference= sum-result;
        System.out.println(difference);

return difference;
    }

    public static void main(String[] args) {
        DifferenceOfSum obj= new DifferenceOfSum();
        int a[]={1,2,3,4};
    obj.findingDifference(a);

    }

}
