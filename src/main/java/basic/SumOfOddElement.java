package basic;

public class SumOfOddElement {
    public static void main(String[] args) {
        int[]a={7, 22, 19, 44, 45, 65, 66};
        int b=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            {
                b= b+a[i];
                System.out.println(+b);
            }
        }

    }
}
