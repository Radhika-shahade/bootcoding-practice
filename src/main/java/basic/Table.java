package basic;

import java.util.Scanner;

public class Table {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to create a table:");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
           int  table= num*i;
            System.out.println(table);

        }


    }
}
