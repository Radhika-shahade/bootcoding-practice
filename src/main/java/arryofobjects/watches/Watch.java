package arryofobjects.watches;

public class Watch {
    protected String companyName;
    public  Watch(String companyName)
    {
        this.companyName=companyName;
    }
    public void display()
    {
        System.out.println("Watch company is: "+ companyName);
    }

}
