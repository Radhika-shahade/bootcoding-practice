package inputfromscanner;

import java.util.Scanner;

public class ConversionOfTime {
    public static void secondsToHour(int value)
    {
        int  seconds = value%60; //20
        int hour= value/60;
        int minutes= hour%60;
        hour=hour/60;

        System.out.println(hour+":"+minutes+":"+seconds);


    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the seconds");
        int userInput=sc.nextInt();
        secondsToHour(userInput);
    }

}
