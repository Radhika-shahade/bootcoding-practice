package basic;

import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the minutes for conversion:");
        int min = sc.nextInt();
        double result= min*60;
        System.out.println(+result);




    }

}
