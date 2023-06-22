package basic;

public class Employee {
    int id ;
    String firstname;
    String lastname;
    int salary;

public void employeeDetail()
{
    System.out.println("Id of employee: " +id);
    System.out.println("First name is: "+firstname);
    System.out.println("last name is: " +lastname);
    System.out.println("salary of Employee:" +salary);
}

    public void getAnnualSalary()
    {
       int  annualsalary= 12* salary;
        System.out.println(annualsalary);
    }
    public int getRiseSalary(int percent)
    {
        int newsalary=salary+(percent * salary) /100;
        System.out.println("salary incresed by "+ percent+ " percent so hike in the salary is "+ newsalary);
        return newsalary;
    }

    public static void main(String[] args) {
        Employee result= new Employee();
        result.id=101;
        result.firstname="ram";
        result.lastname=" shahu";
        result.salary=20000;
        result.employeeDetail();
        result.getAnnualSalary();
        result.getRiseSalary(5);
        Employee result2= new Employee();
        result.id=102;
        result.firstname="ramesh";
        result.lastname="chaudhary";
        result.salary=30000;
        result.employeeDetail();
        result.getAnnualSalary();
        result.getRiseSalary(15);



    }

}
