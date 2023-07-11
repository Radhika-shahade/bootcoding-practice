package src.main.java.hackerrank;

public class PalindromeString {
    public static void main(String[] args) {
        String s="madam";
        String t=new StringBuilder(s).reverse().toString();

        if(s.equals(t))
        {
            System.out.println("Palindrome String");
        }
        else {
            System.out.println(s+ " is not an palindrome");
        }

    }
}
