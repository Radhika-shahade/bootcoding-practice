package collections.arraylist.watch;

public class WallWatch extends Watch{
    private int cost;

    public WallWatch(String companyName, int cost) {
        super(companyName);
        this.cost=cost;
    }
    public void display()
    {
        System.out.println("company name: "+ companyName + "cost is "+cost );
    }

}
