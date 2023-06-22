package basic;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the length of array :");
        int size= sc.nextInt();
        System.out.println("enter the element of array:");
        int number[]=new int [size];
        for(int i=0;i<number.length;i++)
        {
            System.out.println("ENter Number "+ (i+1)); // count the number
             number[i] = sc.nextInt();
        }
        //
        System.out.println("Element array looks like ");
        for(int j=0;j<number.length;j++)
        {
            System.out.println(number[j]);
        }


    }
}
