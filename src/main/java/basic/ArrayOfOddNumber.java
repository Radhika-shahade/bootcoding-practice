package basic;

import java.util.Scanner;

public class ArrayOfOddNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of array");
        int length=sc.nextInt();
        System.out.println("enter the elements of array:");
        int num[]=new int[length];
        for(int i=0;i<num.length;i++)
        {
            if(num[i]%2!=0)
            {
                System.out.println(num[i]);
            }
        }

    }
}
