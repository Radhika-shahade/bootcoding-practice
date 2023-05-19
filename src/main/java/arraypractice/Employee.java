package arraypractice;

public class Employee {
   private int id;
   private String name;
   private String city;
   private int age;
   private int salary;

    //salary
    // city
    // age;
    public Employee(int id, String name, String city, int age, int salary)
    {
        this.id=id;
        this.name=name;
        this.city=city;
        this.age=age;
        this.salary=salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public static void findingSameCity(Employee employee[])
    {
        for(int i=0;i< employee.length;i++)
        {
            Employee emp = employee[i];
            if(emp.getCity().contains("nagpur"))
            {
                System.out.println(employee[i]);

            }

        }
        System.out.println("************");
    }
    public static void checkingSalary(Employee salary[])
    {
        for(int i=0;i<salary.length;i++)
        {
            Employee sal= salary[i];
            if(sal.salary<30000)
            {
                System.out.println(salary[i]);

            }
        }
        System.out.println("************");

    }

    public static void ageOfEmployee(Employee age[])
    {
        for(int i=0;i<age.length;i++)
        {
            Employee empage= age[i];
            if(empage.age>35)
            {
                System.out.println(age[i]);

        }


        }
        System.out.println("************");
    }


    public static void main(String[] args) {
        Employee[] employees= new Employee[5];
        employees[0]= new Employee(1, "ramesh", "nagpur", 30,20000);
        employees[1]= new Employee(2, "suresh","amravati",27,25000 );
        employees[2]= new Employee(3, "ram", "nagpur", 35,27000);
        employees[3]= new Employee(4, "tina","nagpur",37,35000);
        employees[4]= new Employee(5, "saurabh", "pune", 40,35000);
        findingSameCity(employees);
        checkingSalary(employees);
        ageOfEmployee(employees);





    }
}
