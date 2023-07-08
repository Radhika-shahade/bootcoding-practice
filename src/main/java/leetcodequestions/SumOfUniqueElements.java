package src.main.java.leetcodequestions;

import java.util.*;

//1748. Input: nums = [1,2,3,2]
//Output: 4
public class SumOfUniqueElements {
  int sum;
  public  int findingSum(int[]nums)
  {
   for(int n :nums)
   {
     boolean unique= uniqueCheck(n,nums);
     if(unique)
     {
       sum+=n;
     }
   }
   return sum;

  }
  public boolean uniqueCheck(int n,int arr[])
  {
    int count=0;
    for(int i:arr)
    {
      if(i==n)
      {
        count++;
      }
      if(count>1)
      {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int arr[]={1,1,1,1};
    SumOfUniqueElements obj= new SumOfUniqueElements();
    System.out.println(obj.findingSum(arr));


  }

}
