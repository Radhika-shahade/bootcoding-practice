package src.main.java.hackerrank;

import java.util.Scanner;

public class BigInteger {
    public static void main(String[] args) {
        Scanner scc= new Scanner(System.in);
        System.out.println("Enter the number");
        java.math.BigInteger a= new java.math.BigInteger(scc.nextLine());
        java.math.BigInteger b= new java.math.BigInteger(scc.nextLine());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

    }
}
