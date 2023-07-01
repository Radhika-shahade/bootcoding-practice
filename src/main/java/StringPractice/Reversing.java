package src.main.java.StringPractice;

public class Reversing {
    public static void main(String[] args) {
        String s="hello people";
       String val[]= s.split(" ");
       for(int i= val.length-1;i>=0;i--)
       {
           System.out.println(val[i]);
       }

    }
}
