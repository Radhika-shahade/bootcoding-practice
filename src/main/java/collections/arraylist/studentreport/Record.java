package src.main.java.collections.arraylist.studentreport;

public class Record {
    private String name;
    private boolean isPursuing;
    private double cgpa;
//POJO stands for "Plain Old Java Object."
// It is a term commonly used in Java programming to describe a Java class
// that encapsulates data and provides simple getter and setter methods for
// accessing and modifying that data.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPursuing() {
        return isPursuing;
    }

    public void setPursuing(boolean pursuing) {
        isPursuing = pursuing;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}
