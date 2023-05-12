package inheritance;

public class CheckBalance {

    public int checkingBalance(int amount ,int wa)
    {
        int balance= amount-wa;
        System.out.println("bank balance is:"+balance);
        return balance;

    }

    public static void main(String[] args) {
        Deposit dp= new Deposit();
        dp.depositedamount(50000);
        Withdraw wn= new Withdraw();
        wn.withdrawAmount(5000);
        CheckBalance cv= new CheckBalance();
        cv.checkingBalance(50000,5000 );


    }
}
