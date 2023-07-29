package src.main.java.leetcodequestions;

public class PalindromeString {
    public void firstPalindrome(String[] words) {
        for(int i=0;i< words.length;i++){
            String s= new StringBuilder(i).reverse().toString();
            if(s.equals(words))
            {
                System.out.println(words[i]);
//                return words[i];
            }

        }


    }

    public static void main(String[] args) {
        String[] s={"abc","car","ada","racecar","cool"};
        PalindromeString ps= new PalindromeString();
        ps.firstPalindrome(s);

    }
}

