package arraypractice;
//WAP to print element of an array if second index and second last index values are same [7, 22, 19, 44, 45, 22, 17]
public class IndexPosition {
    public void checkingSecondAndSecondLast(int arr[])
    {
        int n= arr.length;
        if(arr[1]==arr[n-2]) {
            System.out.println("second index and second last index values are same");

                System.out.println(arr[n-2]);

        }
        else
        {
            System.out.println("second index and second last index values are not same");
        }
    }
    public static void main(String[] args) {
        int arr[]={ 7, 22, 19, 44, 45, 22, 17};
        IndexPosition result= new IndexPosition();
        result.checkingSecondAndSecondLast(arr);
    }
}
