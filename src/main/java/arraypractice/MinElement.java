package arraypractice;

public class MinElement {
//    WAP to find min element of an array
    public int findingMinElement(int arr[])
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println(+min);


        String s = "expensive";
        String substring = s.substring(2);
        String substring1 = s.substring(0, 3);
        System.out.println(substring);
        System.out.println(substring1);
        return min;
    }

    public static void main(String[] args) {
        int[] arr={1,7,6,9,8};
        MinElement find= new MinElement();
        find.findingMinElement(arr);
    }

}
