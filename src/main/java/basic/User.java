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


}
