package inheritance;

public class Discount {
    public int getCustomerDiscount(String customerType) {
        if (customerType.equals("Regular")) {
            return 40;
        }else
        if (customerType.equals("preminum")) {
            return 50;
        }else
        if (customerType.equals("Non Regular")) {
            return 10;
        }
        return 0;
    }
}
