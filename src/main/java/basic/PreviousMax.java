package basic;

public class PreviousMax {
    public static void main(String[] args) {
        int arr[]={22,43,20,30};
        int max =arr [0];
        int previousMax=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]<max)
            {
             previousMax =max;
                max=arr[i];

            }
        }
        System.out.println(previousMax);



    }
}
