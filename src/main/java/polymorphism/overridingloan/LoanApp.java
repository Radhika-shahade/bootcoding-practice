package polymorphism.overridingloan;

public class LoanApp {
    public static void main(String[] args) {
        HomeLoan hl= new HomeLoan();
        double h1ROI= hl.calculateRoi();
        System.out.println("HOME Loan ROI: " + h1ROI );
    }
}
