package String;
//Palindrome Number

public class PalindromeNumber {
    public int checkPalidromeNumber(int num) {
        int temp = 0;
        temp=num;
         int reverse=0;
        while (num> 0) {
            int remainder = num % 10;
      reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        if(reverse==temp)
        {
            System.out.println("number is palidrome number");
        }
        return reverse;
    }

    public static void main(String[] args) {
        PalindromeNumber result= new PalindromeNumber();
        result.checkPalidromeNumber(-121);
    }
}
