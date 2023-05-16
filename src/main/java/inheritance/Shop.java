package inheritance;

public class Shop {
    public int getStaffSalary(String staffType)
    {
        if(staffType.equals("Sales Department"))
        {
            return 5000;
        }
        if(staffType.equals("Cash counter Department"))
        {
            return 10000;
        }
        if(staffType.equals("cleaning worker"))
        {
            return 2000;

        }
        return 0;
    }

    public static void main(String[] args) {
        Staff staffinfo= new Staff();
        staffinfo.name= "suraj";
        staffinfo.id=101;
        staffinfo.type="Cash counter Department";
        Shop shop= new Shop();
      int staffSalary=  shop.getStaffSalary(staffinfo.type);
        System.out.println("employee name is " +staffinfo.name+ "  and salary is "+staffSalary );
    }

}
