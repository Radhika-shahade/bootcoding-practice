package assignmentspractice;
//Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class EvenOrOdd {
    public void checkingNumber(int num)
    {

        if(num%2==0)
        {
            System.out.println(num+ " is even number");
        }
        else
        {
            System.out.println(num+ " is odd number");
        }
    }

    public static void main(String[] args) {
        EvenOrOdd ev= new EvenOrOdd();
        Scanner sc= new Scanner(System.in);
        while(true) {
            System.out.println(" Enter any number : ");
            int num = sc.nextInt();

            if(num==0)
            {
                break;
            }
            ev.checkingNumber(num);
        }
    }
}
