package leetcodequestions;
//. Maximum Count of Positive and Negative Integers
public class MaximumCountOfInteger {
    public int maximumCount(int[]arr)
    {
        int maximumcount=0;
    int poscount=0;
    int negcount=0;
        for(int i=0;i<arr.length;i++)
        {
        if(arr[i]>0)
        {
            poscount++;
        }
        if(arr[i]<0)
        {
            negcount++;
        }
        }
        if(poscount>negcount)
        {
            maximumcount= poscount;
        }
        else {
           maximumcount=negcount;
        }
        System.out.println(maximumcount);
        return maximumcount;

    }

    public static void main(String[] args) {
        MaximumCountOfInteger result= new MaximumCountOfInteger();
        int a[]={-2,-1,0,0,0,3};
        result.maximumCount(a);

    }
}
