package hackerrank;

import java.util.Scanner;

//In each line of output there should be two columns:
//The first column contains the String and is left justified using exactly characters.
//The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes
//output:
//java           100
//cpp            065
//python         050
public class OutputFormatting {
    public static void justifiedOutput(String s,int n) {
        String t = s;
        int y = n;

            System.out.printf("%-15s %03d\n", t, y);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the string value");
            String s = sc.nextLine();
            System.out.println("Enter the number");
            int num = sc.nextInt();
            justifiedOutput(s, num);
        }
    }
}
