package constructor;

public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;
    public Employee(int id,String firstname,String lastname,int salary)
    {
        this.id= id;
        this.firstname=firstname;
        this.lastname=lastname;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary() {
        this.salary = salary*12;
    }
    public int getRiseInSalary(int percent)
    {
        this.salary= this.salary+(percent*salary/100);
    return this.salary;
    }

}
