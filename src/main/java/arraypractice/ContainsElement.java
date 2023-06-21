package arraypractice;
//Program to check if an array contains a specific element:

public class ContainsElement {
    public boolean checkingSpecificElement(int arr[])
    {
        int target=3;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsElement obj= new ContainsElement();
        int arr[]={4,5,6,7,3};
        System.out.println(obj.checkingSpecificElement(arr));
    }

}
