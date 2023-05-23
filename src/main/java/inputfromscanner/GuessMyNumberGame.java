package inputfromscanner;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumberGame {
//
//    The goal of this exercise is to program a Guess My Number
//game. When it’s finished, it should work like this:
//I'm thinking of a number between 1 and 100
//(including both). Can you guess what it is?
//Type a number: 45
//Your guess is: 45
//The number I was thinking of is: 14
//You were off by: 3
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        int myNumber=sc.nextInt();
        Random random= new Random();
        int number= random.nextInt(100);
        System.out.println("Random number  is "+number); //The number I was thinking of is
        System.out.println(" Entered number is:" + myNumber); //Type a number or Your guess is
        int offBy=1;
        offBy= myNumber-number;
        System.out.println(Math.abs(offBy));


    }
}
