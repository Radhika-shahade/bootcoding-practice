package basic;

public class AccountUsingConstructor {
    String name;
    int id;
    int balance;

    public AccountUsingConstructor(String name, int id, int totalbalance)
    {
        this.name = name;
        this.id = id;
        this.balance = totalbalance;

    }

    public AccountUsingConstructor(int amount , int balance ) {
        int creditamount = balance + amount;
        System.out.println("Balance with credit amount: " + creditamount);
    }

    public AccountUsingConstructor(int debitamount) {
        if (debitamount <= balance) {
            balance = balance - debitamount;
            System.out.println("after debiting account balance :" + balance);
        } else {
            System.out.println("amount exceeded balance");
        }
    }
}

