package src.main.java.leetcodequestions;
//35.Input: nums = [1,3,5,6], target = 5
//Output: 2
public class InsertSearchPosition {
    public static int findInsertPosition(int arr[], int target)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=target)
            {
                return i;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int arr[]={1,3,5,6};
       int n = findInsertPosition(arr,5);
        System.out.println(n);
    }

}
