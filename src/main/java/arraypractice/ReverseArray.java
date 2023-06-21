package arraypractice;

public class ReverseArray {
    public void ReversingArray(int arr[])
    {
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        ReverseArray ra= new ReverseArray();
        int a[]={3,5,6,7,8};
        ra.ReversingArray(a);
    }
}
