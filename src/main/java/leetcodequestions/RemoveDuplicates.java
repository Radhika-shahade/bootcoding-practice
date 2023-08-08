package src.main.java.leetcodequestions;

import java.util.Arrays;

// 26.Remove Duplicates from Sorted Array
//Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums)
    {
      int rd=0;
      for(int i=0;i<nums.length;i++)
      {
          if(nums[rd]!=nums[i])
          {
              rd++;
              nums[rd]=nums[i];
          }
      }
      return rd+1;
    }

    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,4};
       int ans = removeDuplicates(arr);
        System.out.println(ans);
    }

}
