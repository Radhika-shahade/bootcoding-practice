package src.main.java.recursion;

public class FibonacciSeries {
    public int fib(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        return (fib(n-1)+fib(n-2));
    }

    public static void main(String[] args) {
        FibonacciSeries obj= new FibonacciSeries();
        int ans = obj.fib(10);
        System.out.println(ans);
    }

}
