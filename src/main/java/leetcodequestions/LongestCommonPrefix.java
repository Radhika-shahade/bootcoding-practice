package src.main.java.leetcodequestions;
//que 14: Input: strs = ["flower","flow","flight"]
//Output: "fl"
public class LongestCommonPrefix {
    public String common(String s1, String s2)
    {
        int n=Math.min(s1.length(),s2.length());
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<n;i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
            {
                sb.append(s1.charAt(i));
            }
            else {
                break;
            }
        }
        return sb.toString();
    }
    public String longestCommonPrefix(String[]strs)
    {
        String rs=strs[0];
        for(int i=1;i<strs.length;i++)
        {
            rs=common(rs,strs[i]);
        }
        return rs;
    }

    public static void main(String[] args) {
        LongestCommonPrefix obj= new LongestCommonPrefix();
        String strs[] = {"flower","flow","flight"};
        String ans =obj.longestCommonPrefix(strs);
        System.out.println(ans);
    }


}
