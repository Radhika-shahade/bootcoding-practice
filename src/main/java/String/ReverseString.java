package String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int size=input.length();
        for(int i=size-1; i>=0;i--)
        {
            char rev= input.charAt(i);
            System.out.println(rev);
        }

    }
}
