package src.main.java.leetcodequestions;

public class ConcatenationOfArray {
    public static int[] concatenationOfArray(int nums[])
    {
        int ans[]=new int[2*nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];

        }
        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }


      return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3};

        concatenationOfArray(arr);
    }
}
