package src.main.java.collections.arraylist.marks;

import basic.Main;
import src.main.java.collections.arraylist.marks.SubjectMark;
import src.main.java.collections.arraylist.marks.SubjectMarkService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SubjectMarksAPP {
    public static void main(String[] args) {
        SubjectMarkService sms= new SubjectMarkService();
        List<SubjectMark> subjectMarks = sms.generateSubMarks(10000);
        sms.processData(subjectMarks);


        //Traverse  // Iteration
        List<SubjectMark> distinctionMarks = subjectMarks.stream()
                .filter(m -> m.getObtainedMarks() >= 80)
                .collect(Collectors.toList());

        Map<String, Integer> subjectCount = sms.getSubjectCount(distinctionMarks);

        System.out.println("Distinction Students Count: " + distinctionMarks.size());
        System.out.println(subjectCount);
        print(subjectMarks);
    }
    private static void print(List<SubjectMark> data){
        for(SubjectMark sm : data){
            System.out.println("Subject : " + sm.getSubjectName());
            System.out.println("Total Marks: " + sm.getTotalMarks());
            System.out.println("Obtained Marks: " + sm.getObtainedMarks());
            System.out.println(sm.getGrade());
            System.out.println("result: "+ (sm.isPassed()? "Passed":"Failed"));
        }
    }

}


