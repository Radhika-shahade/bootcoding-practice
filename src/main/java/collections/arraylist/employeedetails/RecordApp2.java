package collections.arraylist.employeedetails;
//Keep 10k employees into arraylist and print their name, experience, salary, age
import java.util.ArrayList;

public class RecordApp2 {
    public static void main(String[] args) {
   RecordService rd= new RecordService();
        ArrayList<Record> records= rd.getRecords(10000);
        for(int i=0;i< records.size();i++)
        {
            System.out.println(i);
            System.out.println("NAME: "+ records.get(i).getName());
            System.out.println("EXPERIENCE: "+ records.get(i).getExperience());
            System.out.println("SALARY: "+records.get(i).getSalary());
            System.out.println("AGE: "+ records.get(i).getAge());
        }

    }
}
