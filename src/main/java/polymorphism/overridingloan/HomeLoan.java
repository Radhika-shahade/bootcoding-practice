package polymorphism.overridingloan;

public class HomeLoan extends BaseLoan{
    public double calculateRoi()
    {
        System.out.println("Child method invoked");
        return 9.5;
    }
}
