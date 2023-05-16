package arraypractice;
//WAP to print element of an array if first index and last index values are same [7, 22, 19, 44, 45, 65, 7]
public class CheckingIndex {
    public void checkingIndexPosition(int arr[])
    {
        int n= arr.length;
            if(arr[0]== arr[n-1])   //arr[n-1] gives last index position
            {
                for(int i=0;i<n;i++)

                {
                    System.out.println(arr[i]);
                }
            }
            else {
                System.out.println("first index and last index values are not same");
            }

    }

    public static void main(String[] args) {
        int arr[]= {7, 22, 19, 44, 45, 65, 7};
        CheckingIndex result =new CheckingIndex();
        result.checkingIndexPosition(arr);

    }
}
