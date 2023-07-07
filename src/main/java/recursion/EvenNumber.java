package src.main.java.recursion;

public class EvenNumber {
    public static int evenNumber(int n)
    {
        if(n==1)
        {
            return 1;
        }
        if(n%2==0)
        {
            System.out.println(n);
        }

        return evenNumber(n-1);
    }

    public static void main(String[] args) {
        evenNumber(10);
    }
}
