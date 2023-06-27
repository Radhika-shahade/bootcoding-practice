package collections.arraylist.doctor;

import java.util.ArrayList;
//Keep 10k doctors into arraylist and print name, education, age, type of doctor
public class DoctorApp {
    public static void main(String[] args) {
        DoctorService ds= new DoctorService();
        ArrayList<Doctor>obj= ds.getData(10000);
        for(int i=0;i<obj.size();i++)
        {
            System.out.println(i);
            System.out.println("NAME: "+ obj.get(i).getName());
            System.out.println("EDUCATION: "+obj.get(i).getEducation());
            System.out.println("AGE: "+ obj.get(i).getAge());
            System.out.println("TYPE OF DOCTOR: "+obj.get(i).getTypeOfDoctor());
        }
    }
}
