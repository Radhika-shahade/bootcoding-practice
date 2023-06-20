package StringPractice;
//Checking if a String is Palindrome:
public class PalindromeString {
    public static void main(String[] args) {
        String inputString= "kktttkk";
        boolean isPalindrome=true;
        for(int i=0;i<inputString.length()/2;i++)
        {
//            System.out.println(inputString.charAt(i));
            //k                       !=                  last element i.e k
             if(inputString.charAt(i) != inputString.charAt(inputString.length()-1-i))
            {
             isPalindrome=false;

            }
        }
        System.out.println("is palindrome?"+ isPalindrome);
    }
}
