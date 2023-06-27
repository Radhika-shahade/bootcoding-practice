package collections.arraylist.employeedetails;
//Keep 10k employees into arraylist and print their name, experience, salary, age
public class Record {
    private String name;
    private float experience;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getExperience() {
        return experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
