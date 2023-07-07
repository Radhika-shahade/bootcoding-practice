package src.main.java.recursion;

public class SumOfNumbers {
    public static int sumOfNum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNum(n - 1);

    }

    public static void main(String[] args) {
        System.out.println(sumOfNum(5));
    }
}
