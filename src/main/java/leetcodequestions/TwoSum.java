package src.main.java.leetcodequestions;
// que1:Input: nums = [3,2,4], target = 6
//Output: [1,2]
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
      for(int i=0;i<nums.length;i++)
      {
          for(int j=i+1;j< nums.length;j++)
          {
              if(nums[i]+nums[j]==target)
              {
                  int a[]={i,j};
                  return a;
              }
          }
      }
      return null;
    }

    public static void main(String[] args) {
        TwoSum obj= new TwoSum();
        int arr[]={3,2,4};
       int a[]= obj.twoSum(arr,6);
        for(int ans:a)
        {
            System.out.println(ans);
        }
    }

}
