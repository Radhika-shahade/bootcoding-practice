package assignmentspractice;

import java.util.Scanner;

public class GettingMessage {
    public void printingGreetingMessage(String name)
    {
        System.out.println(name+ " Happy birthday!");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the name");
        String name=sc.nextLine();
        GettingMessage obj= new GettingMessage();
        obj.printingGreetingMessage(name);



    }


}
