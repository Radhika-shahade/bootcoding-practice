public class Customer {
    public void argument(double prob, int price, int pay)
    {
        boolean result= prob*price>pay;
        System.out.println(result);

    }
    public static void main(String[] args) {
        Customer cv= new Customer();
        cv.argument(0.2,50,9);

    }
}
