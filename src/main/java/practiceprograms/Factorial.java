package practiceprograms;

public class Factorial {
    public static long [] findfactorial(int[]nums)
    {
        long b[]=new long[nums.length]; // array size define

        for(int i=0;i<nums.length;i++) {   //index of the array
            long fact = 1;

            for (int j = 1; j <= nums[i]; j++) {   // elements of array

                fact = fact * j;
            }
            b[i]=fact;  //stores the result
        }
        return b;

    }

    public static void main(String[]args) {
        int nums[]={5,3,2,7,8,9};

       long[] res=findfactorial(nums);

        for (int i = 0; i <  res.length ; i++) {
            System.out.println(res[i]);

        }

    }
}
