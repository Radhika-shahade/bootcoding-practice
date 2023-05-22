package leetcodequestions;

import java.util.Arrays;

//Increment the large integer by one and return the resulting array of digits.
public class IncrementingInteger {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;  //2 3 4 //6 7 9
        while (i > 0) {
            if (digits[i] !=9) {
                digits[i] = digits[i] + 1;
                return digits;
            }
            digits[i] = 0;
            i--;
        }
        int res[]=new int[digits.length+1];
        res[i]=1;
        return res;
    }

    public static void main(String[] args) {
        IncrementingInteger result= new  IncrementingInteger();
        int digits[]={2,4,6};
        System.out.println(Arrays.toString(result.plusOne(digits)));

    }
}
