package polymorphism.overloadingfitness;

import java.util.Calendar;
import java.util.Date;

public class ExerciseApp {
    public static void main(String[] args) {
        HumanExercise hl= new HumanExercise();
        hl.run();
        hl.print();

        hl.run(30);
        hl.print();

        Calendar c= Calendar.getInstance(); // starts with today's date and time
        c.add(Calendar.DAY_OF_YEAR,2) ; // advances day by 2
         Date date = c.getTime();// gets modified time
        hl.run(date,45);
        hl.print();

    }
}
