package polymorphism.overloadingpurchase;
//Purchase Mobile (with Company Name, with CN and Quantity, with CN, Quantity and Do you need backCover )
public class MobileService {
    private String companyName;
    private int quantity;
    public void purchase()
    {
        companyName="Samsung";
        quantity=2;
    }
    public void purchase(String companyName,int quantity)
    {
        this.companyName=companyName;
        this.quantity=quantity;
    }
    public String purchase(String companyName,int quantity,Boolean ans)
    {
        this.companyName=companyName;
        this.quantity=quantity;
        if(ans)
        {
            System.out.println("need backCover ");
            return "yes" ;
        }
        else
            return "No";
    }
    public void print()
    {
        System.out.println("customer required " +companyName + " mobile \n quantity = " +quantity   );
    }





}
