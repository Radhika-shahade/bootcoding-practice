package src.main.java.recursion;

public class MinElement2 {
   public int findMinimumElement(int[]nums,int i,int min)
   {
       if(i==min)
       {
           return min;
       }
       min=Math.min(min,nums[i]);
       return findMinimumElement(nums,min,++i);
   }

    public static void main(String[] args) {
        MinElement2 obj= new MinElement2();
        int arr[]={2,1,3,4};
       int min = obj.findMinimumElement(arr,0,2);
        System.out.println(min);
    }

}
