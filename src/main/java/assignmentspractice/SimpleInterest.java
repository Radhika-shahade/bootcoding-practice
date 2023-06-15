package assignmentspractice;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class SimpleInterest {
    public void calculateSI(double principal, double time,double rate)
    {
        double simpleInterest= (principal*time*rate)/100;
        System.out.println(simpleInterest);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the amount ");
        double principal =sc.nextDouble();
        System.out.println(" Enter the time in months ");
        double time =sc.nextDouble();
        System.out.println(" enter the interest rate");
        double rate= sc.nextDouble();
        SimpleInterest si= new SimpleInterest();
        si.calculateSI(principal,time,rate);
    }
}
