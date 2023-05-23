package inputfromscanner;

import java.util.Scanner;

public class PrimeNumber {
    public  static boolean isPrime(int val)
    {
        return val%2==0;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(true) {
            System.out.println("Enter any number: (To exit,enter- 1)");
            int x = sc.nextInt();
            if(x<0)
            {
                break;
            }
           boolean res = isPrime(x);
            if(res){
                System.out.println(x + "  is a prime number!");
            }
            else {
                System.out.println(x+ " is not a prime number!");
            }
        }

    }

}
