package src.main.java.leetcodequestions;
//169. Majority Element
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int value= 0;
        int count=0;

        for (int i = 0; i < nums.length; i++) {
            if(count==0)
            {
                value=nums[i];
            }
            if (value==nums[i])
            {
                count++;
            }
            else {
                count--;
            }

        }
        return  value;
    }

    public static void main(String[] args) {
        MajorityElement obj= new MajorityElement();
        int arr[]={1,1,1,2,2,2,2};
        System.out.println(obj.majorityElement(arr));
    }
}
