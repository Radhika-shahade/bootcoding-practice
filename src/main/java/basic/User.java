package basic;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age in year:");
        int age= sc.nextInt();
        int days=age*365;
        System.out.println(+days);



    }


    public static class CountOfNumber {
        public static void main(String[] args) {
            int countp=0;
            int countn=0;
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the elements");
            int arr[]= new int[5];
            for(int i=0;i<arr.length;i++)
            {
                 arr[i]=sc.nextInt();
            }
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>0)
                {
                    countp++;
                }
                else {
                    countn++;
                }
            }
            System.out.println("Positive numbers are:" +countp);
            System.out.println("Negative numbers are:" +countn);
        }
    }
}
