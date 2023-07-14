package src.main.java.hackerrank;

import java.util.Scanner;

public class JavaStringToken {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the sentence");
        String s =sc.nextLine();
//        s.trim();
        if(s.length()==0)
        {
            return ;
        }
        String [] str=s.split("[^a-zA-Z]+");
        System.out.println(str.length);
        for(String t :str)
        {
            System.out.println(t);
        }
    }


}
