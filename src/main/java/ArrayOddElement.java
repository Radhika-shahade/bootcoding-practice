public class ArrayOddElement {
    public static void main(String[] args) {
        int[]b={7, 22, 19, 44, 45, 65, 66};
        for(int i=0;i<b.length;i++)
        {
            if(b[i]%2!=0)
            {
                System.out.println(+b[i]);
            }
        }
    }
}
