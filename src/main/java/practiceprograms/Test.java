package practiceprograms;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size= scanner.nextInt();
        int elements[]=new int[size];
        System.out.println("Enter the elements of array");
        int result=0;
        for(int i=0;i<elements.length;i++)
        {
            System.out.println("enter the number:" +(i+1));
            elements[i]= scanner.nextInt();
            if(elements[i]%2==0)
            {
                result= result+elements[i];


            }


        }
        System.out.println(+result);


    }
}
