package src.main.java.leetcodequestions;

public class LargestOddNumberInString {
//    Input: num = "52"
//    Output: "5"
    public static String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--)
        {
            char c = num.charAt(i);
            if(c%2==1)
            {
                return num.substring(0,i+1);
            }
        }
        return "";

    }

    public static void main(String[] args) {
        String s="52";
        System.out.println(largestOddNumber(s));
    }
}