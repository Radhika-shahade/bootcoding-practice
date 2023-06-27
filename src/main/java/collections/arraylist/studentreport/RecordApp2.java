package collections.arraylist.studentreport;

import java.util.ArrayList;

public class RecordApp2 {
    public static void main(String[] args) {
        RecordService rd= new RecordService();
        ArrayList<Record>records=rd.getRecords(10000);
        for(int i=0;i< records.size();i++)
        {
            System.out.println(i);
            System.out.println("Name: " + records.get(i).getName());
            System.out.println("cgpa: "+ records.get(i).getCgpa());
            System.out.println("isPassOut: "+records.get(i).isPursuing());
        }
    }

}
