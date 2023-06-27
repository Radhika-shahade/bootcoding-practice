package collections.arraylist.doctor;
//Keep 10k doctors into arraylist and print name, education, age, type of doctor
public class Doctor {
    private String name;
    private String education;
    private int age;
    private String typeOfDoctor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTypeOfDoctor() {
        return typeOfDoctor;
    }

    public void setTypeOfDoctor(String typeOfDoctor) {
        this.typeOfDoctor = typeOfDoctor;
    }
}
