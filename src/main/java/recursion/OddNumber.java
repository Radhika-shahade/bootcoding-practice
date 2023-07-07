package src.main.java.recursion;

public class OddNumber {
    public static void oddNumber(int n)
    {
        if(n==0)
        {
            return ;
        }

        oddNumber(n-1);

        if(n%2!=0)
        {
            System.out.println(n);
        }

    }

    public static void main(String[] args) {
        oddNumber(10);
    }

}
