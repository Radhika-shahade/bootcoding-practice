package assignmentspractice;

public class MinimumElement {
    public void findingMinimumElement(int arr[])
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)  //{2,3,4,8,1}
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        MinimumElement obj= new MinimumElement();
        int arr[]={4,6,7,1,9};
        obj.findingMinimumElement(arr);


    }

}
