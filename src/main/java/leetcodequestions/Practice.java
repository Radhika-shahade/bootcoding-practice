package src.main.java.leetcodequestions;

public class Practice {
    public int[] runningSum(int[] nums)
    {
        int lastdigit= 0;
        int sum=0;
        int ans[]= new int[nums.length];
        for(int i=1;i< nums.length;i++)
        {
            while(nums[i]>0)
            {
               nums[lastdigit]=nums[i]%10;
                nums[i]=nums[i]/10;
                System.out.println(nums[lastdigit]);
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        Practice obj= new Practice();
        int a[]={1,2,3,4};
        obj.runningSum(a);
    }
}
