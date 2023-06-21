package arraypractice;
//Program to find the average of elements in an array:
public class ArrayAverage {
    int sum;
    public double findAverage(int array[])
    {
        for(int i=0;i<array.length;i++)
        {
            sum+= array[i];

        }
        double average= sum/ array.length;
        return average;
    }

    public static void main(String[] args) {
        ArrayAverage aa= new ArrayAverage();
        int a[]={2,3,4,5};
        System.out.println(aa.findAverage(a));
    }

}
