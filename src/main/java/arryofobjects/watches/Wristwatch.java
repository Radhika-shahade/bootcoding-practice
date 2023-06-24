package arryofobjects.watches;

public class Wristwatch extends Watch{
    private String dial;
    public Wristwatch(String companyName,String dial)
    {
        super(companyName);
        this.dial=dial;
    }
    public void display()
    {
        System.out.println("company name: "+companyName+ "dial type is: " +dial);
    }

}
