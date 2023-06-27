package collections.arraylist.doctor;

import java.util.ArrayList;
import java.util.Random;

//Keep 10k doctors into arraylist and print name, education, age, type of doctor
public class DoctorService {

    public ArrayList<Doctor> getData(int size) {
        ArrayList<Doctor>doctors= new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Doctor dc = buildRecord();
            doctors.add(dc);

        }
return doctors;
    }

    public Doctor buildRecord() {
        Doctor doctor = new Doctor();
        doctor.setName(getRandomName());
        doctor.setTypeOfDoctor(getTypeOfDoctor());
        doctor.setEducation(getEducation());
        doctor.setAge(age());
        return doctor;

    }


    private String getRandomName() {
        String sname[] = {"radha", "saurabh", "tina", "rina", "jiya"};
        int randomIndex = new Random().nextInt(sname.length);
        return sname[randomIndex];
    }

    private String getEducation() {
        String e[] = {"MBBS", "BHMS", "DENTAL", "BAMS"};
        int index = new Random().nextInt(e.length);
        return e[index];
    }

    private int age() {
        int min = 26;
        int max = 45;
        return min + new Random().nextInt(max - min);
    }

    private String getTypeOfDoctor() {
        String[] type = {"Orthopedic Surgeon", " Pediatrician", "Psychiatrist"};
        int indexOfType = new Random().nextInt(type.length);
        return type[indexOfType];
    }

}


