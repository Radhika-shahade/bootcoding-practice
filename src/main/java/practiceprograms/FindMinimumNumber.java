package practiceprograms;

import java.util.Scanner;

public class FindMinimumNumber {
    public static void main(String[] args) {
        Scanner tl= new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int size=tl.nextInt();
        int[]num= new int[size];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<num.length;i++)
        {
            num[i]=tl.nextInt();
        }
        int min=num[0];
        for(int i=1;i<num.length;i++)
        {
            if(num[i]<min)
            {
                min=num[i];
            }
        }
        System.out.println("minimum number :"+ min);
    }
}
