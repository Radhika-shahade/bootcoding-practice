package arraypractice;
//Program to copy elements from one array to another:
public class CopyElement {
    public int[] copyingElement(int arr[])
    {
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            res[i]=arr[i];
            System.out.println(res[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        CopyElement ce= new CopyElement();
        int a[]={6,6,7,7,9,0};
        ce.copyingElement(a);


    }

}
