package arraypractice;
// WAP to find max element of an array
public class MaxElement {

    public int findingMaximumElement(int arr[])
    {
        int max= arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println(+max);
        return max;
    }

    public static void main(String[] args) {
        MaxElement find= new MaxElement();
        int arr[]= {2,32,45,98,78};
        int result=find.findingMaximumElement(arr);
        System.out.println("maximum element is:"+result);
    }


}
