package inputfromscanner;

import java.util.Scanner;

public class ArrayUsingScanner {
    public static boolean isEven(int num) {

        return num%2==0;

    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        System.out.println("enter the elements of array");
       int arr[] = new int[size];
       for(int i=0;i<arr.length;i++)
       {
           System.out.println("Enter elements at index : " +i + "=");
            arr[i] =sc.nextInt();
           boolean res = isEven(arr[i]);
           if(res){
               System.out.println(arr[i] + "  is a even number!");
           }
           else {
               System.out.println(arr[i]+ " is  odd number!");
           }
       }



    }

}
