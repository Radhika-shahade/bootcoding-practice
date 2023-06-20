package StringPractice;

public class ReverseOrder {
    public static void main(String[] args) {
        String s1=" Hello World ";
      String s2[]= s1.split(" ");
      int length= s2.length;
        for(int i=length-1;i>=0;i--)
        {

            System.out.print(s2[i]);
        }
    }
}
