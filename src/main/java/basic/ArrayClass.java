package src.main.java.basic;

import java.util.Scanner;

public class ArrayClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of number:");
        int num= sc.nextInt();
        int[]arr = new int[num];
        System.out.println("enter the elements");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }

    }
}
