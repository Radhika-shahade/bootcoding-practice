package src.main.java.collections.arraylist.studentreport;

import java.util.ArrayList;
import java.util.Scanner;

public class RecordApp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter students record details:");
        System.out.println("Enter student name");
       String sName= sc.next();
        System.out.println("Is student pursuing:");
        boolean isPassOut=sc.nextBoolean();
        System.out.println("Enter the cgpa score:");
        double cgpa =sc.nextDouble();

        //Create object
        Record record= new Record();
        record.setName(sName);
        record.setCgpa(cgpa);
        record.setPursuing(!isPassOut);

        ArrayList<Record>records= new ArrayList<>();
        records.add(record);
        records.add(record);
        records.add(record);
        records.add(record);
        for(int i=0;i< records.size();i++)
        {
            System.out.println("Name: "+records.get(i).getName());
            System.out.println("cgap: "+records.get(i).getCgpa());
            System.out.println("isPassOut: "+records.get(i).isPursuing());
        }


    }
}
