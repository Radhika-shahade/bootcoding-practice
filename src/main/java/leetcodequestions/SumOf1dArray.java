package leetcodequestions;
// 1480.Running Sum of 1d Array
public class SumOf1dArray {
    public int [] getSumOfArray(int arr[])
    {
        int result[]= new int[arr.length];
         result[0]=arr[0];
        for(int i= 1; i<arr.length;i++)
        {
            result[i]= result[i-1]+arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        SumOf1dArray result= new SumOf1dArray();
        int res[]=result.getSumOfArray(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i]);
        }
    }
}
