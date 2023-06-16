package hackerrank;

import java.util.Scanner;

//there are three lines of input:
//The first line contains an integer.
//The second line contains a double.
//The third line contains a String.
//There are three lines of output:
//On the first line, print String: followed by the unaltered String read from stdin.
//On the second line, print Double: followed by the unaltered double read from stdin.
//On the third line, print Int: followed by the unaltered integer read from stdin.
public class StdinAndStdout {
      public static void printMethod(String s,int i,double d)
      {
          System.out.println(s);
          System.out.println(d);
          System.out.println(i);
      }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter integer value");
        int num =sc.nextInt();
        System.out.println("enter decimal value");
        double d= sc.nextDouble();
        System.out.println("Enter any String value");
        sc.nextLine();
        String s =sc.nextLine();
        printMethod(s,num,d);

    }

}
