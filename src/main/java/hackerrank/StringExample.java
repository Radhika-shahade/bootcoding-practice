package src.main.java.hackerrank;
//o/p= 9
//    No/Yes
//   Java Practice (First letter capital)
import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first name");
        String s1 =sc.next();
        System.out.println("Enter second name");
        String s2= sc.next();
        System.out.println(s1.length()+s2.length());
        int c=s1.compareTo(s2);
        if(c<0)
        {
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
        System.out.println(s1.substring(0,1).toUpperCase()+s1.substring(1)+" " +
                ""+s2.substring(0,1).toUpperCase()+s2.substring(1));




    }
}
