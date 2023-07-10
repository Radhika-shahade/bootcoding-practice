package src.main.java.recursion;

public class MinElement {
    public int findMinimumElement(int []num,int min,int i)
    {
        if(i==num.length)
        {
            return min;
        }
        if(min>num[i])
        {
            min=num[i];

        }
        //Math.min(x,y);
        //min=Math.min(min,a[i])
        return findMinimumElement(num,min,++i);
    }

    public static void main(String[] args) {
        MinElement obj= new MinElement();
        int arr[]={2,1,3,4};
        System.out.println(obj.findMinimumElement(arr,2,0));


    }

}
