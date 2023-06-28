package src.main.java.collections.arraylist.marks;

import java.util.*;

public class SubjectMarkService {
    public List<SubjectMark> generateSubMarks(int size) {
        List<SubjectMark> subjectMarks = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            SubjectMark subjectMark = createSubjectMark();
            subjectMarks.add(subjectMark);
        }
        return subjectMarks;
    }

    public Map<String, Integer> getSubjectCount(List<SubjectMark> marks) {
        Map<String, Integer> data = new HashMap<>();
        for (SubjectMark mark : marks) {
            if (data.containsKey(mark.getSubjectName())) {
                Integer existingCount = data.get(mark.getSubjectName());
                data.put(mark.getSubjectName(), existingCount + 1);
            } else {
                data.put(mark.getSubjectName(), 1);
            }

        }
        return data;
    }

    public void processData(List<SubjectMark> mark) {
        for(SubjectMark var :mark)
        {
            getIsPass(var);
            gradeCalculate(var);
        }


    }

    private boolean getIsPass(SubjectMark sm) {
        if (sm.getObtainedMarks() >= 40) {
            return true;
        }
        return false;
    }
public void gradeCalculate(SubjectMark sm){
     if(sm.getObtainedMarks()>=80){
         sm.setGrade("Division-I");
     } else if (sm.getObtainedMarks()>=60 && sm.getObtainedMarks()<=79) {
         sm.setGrade("Division-II");
     }else {
         sm.setGrade("Division-III");
     }
}

    public SubjectMark createSubjectMark() {
        SubjectMark sub = new SubjectMark();
        sub.setSubjectName(getRandomSubject());
        sub.setTotalMarks(100);
        sub.setObtainedMarks(getRandomMarks());

        return sub;
    }

    String[] subjects = {"Mathematics-I", "Database", "Computer network", "Sem", "Operating system", "AI", "DOS"};

    private String getRandomSubject() {

        Random random = new Random();
        int index = random.nextInt(subjects.length);
        return subjects[index];
    }

    private int getRandomMarks() {
        Random random = new Random();
        return 20 + random.nextInt(80);
    }


}
