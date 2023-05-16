package leetcodequestions;
// Running Sum of 1d Array
public class SumOf1dArray {
    public int [] getSumOfArray(int arr[])
    {
        int result=0;

        for(int i= 0; i<arr.length;i++)
        {
            result= result+arr[i];
            System.out.println(result);
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={3,1,2,10,1};
        SumOf1dArray result= new SumOf1dArray();
        result.getSumOfArray(arr);
    }
}
