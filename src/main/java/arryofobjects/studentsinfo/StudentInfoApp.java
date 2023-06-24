package arryofobjects.studentsinfo;

public class StudentInfoApp  {
    public static void main(String[] args) {
        StudentsInfo studentsInfo[]=new StudentsInfo[4];
        studentsInfo[0]=new StudentsInfo("Ram",20);
        studentsInfo[1]=new StudentsInfo("siya",23);
        studentsInfo[2]=new StudentsInfo("ramesh",24);
        studentsInfo[3]=new StudentsInfo("suresh",25);

        for(int i=0;i< studentsInfo.length;i++)
        {
            System.out.println("name: "+studentsInfo[i].name + ", age: "+ studentsInfo[i].age);

        }
    }
}
