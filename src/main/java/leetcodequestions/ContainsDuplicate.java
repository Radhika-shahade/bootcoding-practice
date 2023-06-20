package leetcodequestions;
//217.Given an integer array nums, return true if any value appears at least
// twice in the array, and return false if every element is distinct.

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int arr[]) {

        HashSet<Integer>set=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(set.contains(arr[i])) //if hashset contains duplicate it returns true
            {
                return true;
            }
            else {
                set.add(arr[i]); //if value is not duplicate it adding the value into hashset
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate cd= new ContainsDuplicate();
        int arr[]={1,2,3,1};
       boolean ans = cd.containsDuplicate(arr);
        System.out.println(ans);
    }

}
