package src.main.java;

import java.util.Scanner;

public class FindMaxNumbeer {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any three number");
       int  a = sc.nextInt(); //20
        int b= sc.nextInt();//40
        int c= sc.nextInt();//50


       if(a>b && b>c)
       {
           System.out.println(a);
       }
       if(b>c && b>a)
       {
           System.out.println(b);
       }
       if(c>a && c>b)
       {
           System.out.println(c);
       }


    }
}
