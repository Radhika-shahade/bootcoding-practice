package StringPractice;

public class CapitalLetters {
    public static void main(String[] args) {
        String s="HELLo";
        int value= 'A';
        int value2='Z';
        int count=0;
        for(int i=0;i<s.length();i++)
        {
          int val3 = s.charAt(i);
          if(val3>=65 && val3<=90)
          {
              count++;
          }
        }
        System.out.println(count);
    }
}
