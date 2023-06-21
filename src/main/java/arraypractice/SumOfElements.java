package arraypractice;
//Program to find the sum of all elements in an array:
public class SumOfElements {
    int sum;
    public int findingSumOfElements(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfElements soe= new SumOfElements();
        int arr[]={2,3,4,5};
        System.out.println(soe.findingSumOfElements(arr));
    }

}
