package leetcodequestions;
//Length of Last Word (EE) hello word

public class LengthOfLastWord {
    public int findingLengthOfLastWord(String s)
    {
        String str= s.trim();
        int count=0;
        for(int i= str.length()-1; i>=0;i--)
        {
            if(str.charAt(i)!=' ')
            {
               count++;
            }
            else {
                break;
            }
        }
        System.out.println(+count);
        return count;
    }

    public static void main(String[] args) {
        LengthOfLastWord res= new LengthOfLastWord();
        res.findingLengthOfLastWord(" hello word ");



    }
}
