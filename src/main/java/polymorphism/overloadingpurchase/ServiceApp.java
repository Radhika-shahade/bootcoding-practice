package polymorphism.overloadingpurchase;

import java.util.Scanner;

public class ServiceApp {
    public static void main(String[] args) {
        MobileService ms= new MobileService();
        Scanner sc= new Scanner(System.in);
        System.out.println("Customer 1:");
         ms.purchase();
         ms.print();
        System.out.println("Customer 2:");
         System.out.println(" which mobile do you want? ");
         String name2=sc.nextLine();
         sc.nextLine();
        System.out.println("quantity of mobile ?");
        int quantity=sc.nextInt();
        ms.purchase(name2, quantity);
        ms.print();
        System.out.println("Customer 3:");
        System.out.println(" which mobile do you want? ");
        String name3=sc.nextLine();
      sc.nextLine();
        System.out.println("quantity of mobile ?");
        int quantity2=sc.nextInt();
        ms.print();

        ms.purchase(name3,quantity2,true);
    }
}
