package polymorphism.overridingpurchse;

public class MobileServiceParent {
    public void purchase(String companyName,int quantity)
    {
        System.out.println("parent method invoked");
        System.out.println("company name: " + companyName + "quantity"+quantity);
}
}
