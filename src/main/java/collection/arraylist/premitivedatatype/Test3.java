package collection.arraylist.premitivedatatype;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
//    public void display()
//    {
//        ArrayList<String>obj= new ArrayList<>();
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the car names , write done to stop ");
        ArrayList<String> obj = new ArrayList<>();
        while (true) {
            String s = sc.next();
            if(s.equalsIgnoreCase("done"))
            {
                break;
            }
            obj.add(s);


        }
        for(int i=0;i< obj.size();i++)
        {
            System.out.println(obj.get(i));
        }
    }
}
