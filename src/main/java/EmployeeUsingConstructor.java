public class EmployeeUsingConstructor {
    int id;
    String firstname;
    String lastname;
    int salary;
    int annualsalary;
    int riseinsalary;
    public EmployeeUsingConstructor(int id, String firstname, String lastname,int salary)
    {
        this.id=id;
        this.firstname=firstname;
        this.lastname=lastname;
        this.salary=salary;
        annualsalary=salary*12;
    }

    public void incrementSalary(int percent)
    {
        riseinsalary=this.salary+(percent*this.salary)/100;
    }

    public static void main(String[] args) {
        EmployeeUsingConstructor result= new EmployeeUsingConstructor(101,"saurabh", "shukla", 30000);
        result.incrementSalary(5);
        System.out.println(result.riseinsalary);
        System.out.println(result.id );
        System.out.println(result.firstname);
        System.out.println("initial salary" +result.salary);
        System.out.println("annual salary "+result.annualsalary);

    };


}
