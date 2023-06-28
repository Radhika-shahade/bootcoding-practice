package src.main.java.collections.arraylist.studentresult;

import java.util.Random;

public class StudentService {
    private double calculatePercentage(StudentDetails std)
    {
       double percentage=std.getObtainMark()/std.getTotalMark()*100;
       return percentage;
    }
    public StudentDetails createStudentsData()
    {
        StudentDetails std= new StudentDetails();
        std.setName(getName());
        std.setSubjectName(getSubjects());
        std.setTotalMark(600);
        std.setObtainMark(getObtainedMark());
        return std;
    }
    private String getName(){
       String sName[]={"ram","siya","saurabh","rina","tina","trisha"};
       int index= new Random().nextInt(sName.length);
      return sName[index];
    }
    private int getObtainedMark()
    {
        Random random= new Random();
        return 200+ random.nextInt(600);
    }
    private String getSubjects()
    {
        String sub[]={"Mathematics-I", "Database", "Computer network", "Sem", "Operating system", "AI", "DOS"};
        int index= new Random().nextInt(sub.length);
        return sub[index];
    }

}
