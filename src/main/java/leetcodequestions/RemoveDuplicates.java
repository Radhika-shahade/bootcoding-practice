package leetcodequestions;

import java.util.Arrays;

//Remove Duplicates from Sorted Array
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums)
    {
        int indexcount=1;
        for(int i=0;i< nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1]) //2 2 4 5 8 8 9
            {
                nums[indexcount]=nums[i+1];

                indexcount++;

            }

        }

        return indexcount+1;

    }

    public static void main(String[] args) {
        RemoveDuplicates object = new  RemoveDuplicates();
        int nums[]={0,0,1,1,1,2,2,3,3,4};
       int rd = object.removeDuplicates(nums);
        for(int i=0;i< rd;i++) {
            System.out.println(nums[i]);
        }



    }

}
