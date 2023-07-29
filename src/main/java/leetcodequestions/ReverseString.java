package src.main.java.leetcodequestions;
// 344
public class ReverseString {
    public static char[] reversing(char[]c)
    {
        int start=0;
        int end=c.length-1;
        while(start<=end)
        {
            char temp=c[start];
            c[start]=c[end];
            c[end]=temp;
        }
        return c;
    }

    public static void main(String[] args) {
        char c[]={'h','e','l','l','o','w'};
       char ch[] = reversing(c);
       for(int i=0;i<ch.length;i++)
       {
           System.out.println(ch[i]);
       }

    }
}
