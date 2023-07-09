package src.main.java.hackerrank;

import java.util.Scanner;

public class StringExample2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any string");
        String S = in.next();
        System.out.println("Enter starting index");
        int start = in.nextInt();
        System.out.println("enter ending index");
        int end = in.nextInt();
        for(int i=start;i<end;i++)
        {
            System.out.println(S.charAt(i));
        }
    }
}
