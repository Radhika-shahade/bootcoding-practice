package inputfromscanner;

import java.util.Scanner;

public class Conversion {

    public static void conversionOfTemperature(double value)
    {
     double fahrenheitTemperature= value *9/5+32;
        System.out.println(value+"C ="+ fahrenheitTemperature +"F");

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(true) {
            System.out.println("Enter the Temperature in Celsius (To exit,enter- 1) ");
            double x = sc.nextDouble();
            if(x<0)
            {
                break;
            }
            conversionOfTemperature(x);
        }



    }

}
