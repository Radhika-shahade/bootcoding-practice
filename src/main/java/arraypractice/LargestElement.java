package arraypractice;
//Program to find the largest element in an array:
public class LargestElement {
    public int findingLargestElement(int arr[])
    {
        int max =arr[0]; //{2,4,5,6}
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LargestElement lse= new LargestElement();
        int arr[]={33,4,5,0,-677};
        System.out.println(lse.findingLargestElement(arr));
    }

}
