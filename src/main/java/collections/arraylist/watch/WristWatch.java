package src.main.java.collections.arraylist.watch;

public class WristWatch extends Watch  {
    private String dial;
    public  WristWatch(String companyName, String dial)
    {
        super(companyName);
        this.dial=dial;
    }
    public void display()
    {
        System.out.println("company name: "+companyName+ "dial type is: " +dial);
    }

}
