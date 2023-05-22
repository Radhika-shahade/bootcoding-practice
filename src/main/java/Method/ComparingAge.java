package Method;
public class ComparingAge {
    public void isEligible(int ageNum)
    {
        if(ageNum>=18)
        {
            System.out.println(" candidate is eligible to vote ");
        }
        else {
            System.out.println("candidate is not eligible to vote");

        }
    }

    public static void main(String[] args) {
        ComparingAge result= new ComparingAge();
        result.isEligible(15);

    }

}
