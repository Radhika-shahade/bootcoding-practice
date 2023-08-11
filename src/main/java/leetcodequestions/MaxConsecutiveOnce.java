package src.main.java.leetcodequestions;

import static java.lang.Math.max;

//Input: nums = [1,1,0,1,1,1]
//        Output: 3
public class MaxConsecutiveOnce {
    public  static int findMaxConsecutiveOnes(int[] nums) {

        int count=0; int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                count++;
                ans= max(ans,count);
            }
            else
            {
                count=0;

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,0,1,1,0,1};
        int count= findMaxConsecutiveOnes(arr);
        System.out.println(count);
    }
}


