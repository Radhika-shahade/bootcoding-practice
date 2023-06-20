package StringPractice;
//WAP to total number of numeric character present in a string
public class NumericChar {
    public static void main(String[] args) {
        int count=0;
        String s="34hdfsd45";
        for(int i=0;i<s.length();i++)
        {
            char res= s.charAt(i);
            if(Character.isDigit(res))
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
