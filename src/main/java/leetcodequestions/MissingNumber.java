package src.main.java.leetcodequestions;
// 268.Input: nums = [3,0,1]
// Output: 2


public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+= nums[i];
        }
        int actualSum= nums.length*(nums.length+1)/2;
        return actualSum-sum;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,3};
        MissingNumber obj = new MissingNumber();
        int x= obj.missingNumber(arr);
        System.out.println(x);

        }

    }

