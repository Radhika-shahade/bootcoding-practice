package basic;

public class Account {
    String name;
    int id;
    int balance;
    public void accountHolderDetail()
    {
        System.out.println("Name of account holder: "+name);
        System.out.println("Id of account holder: "+id);
        System.out.println("initial balance "+balance);
    }
    public int creditAmount(int amount)
    {
        balance=balance+amount;
        System.out.println("Balance with credit amount: "+balance);
        return balance;
    }
    public int debitAmount(int debitamount)
    {
        if(debitamount<=balance)
        {
            balance=balance-debitamount;
            System.out.println("after debiting account balance :"+balance);
        }
        else {
            System.out.println("amount exceeded balance");
        }
        return balance;
    }
    public int transferAmount(int transferamount)
    {
        if(transferamount<=balance)
        {
            System.out.println(transferamount+"  transfer to account xyz");
        }
        else {
            System.out.println("amount exceeded balance");
        }
        return transferamount;
    }

    public static void main(String[] args) {
        Account result = new Account();
        result.id = 102;
        result.name = "rahul jain";
        result.balance = 20000;
        result.accountHolderDetail();
        result.creditAmount(5000);
        result.debitAmount(5000);
        result.transferAmount(2000);
    }

    }
