package src.main.java.stringbuilder;

public class Reverse {
    public static void main(String[] args) {
        String str="Hello";
        String rev=new StringBuilder(str).reverse().toString();
        System.out.println(rev);

    }
}
