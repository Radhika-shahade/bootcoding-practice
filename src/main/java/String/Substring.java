package String;

public class Substring {
    public static void main(String[] args) {

        String text = "Totalfoldersingiven"; //used when we don't have any common character in string
        /// substring
        // beginIndex and endIndex
        // beginIndex = 6
        System.out.println(text);
        String substring = text.substring(5);//
        System.out.println(substring);

        int len = text.length(); //count of characters in a string
        String s2 = text.substring(len - 5);
        System.out.println(s2);

        String s3 = text.substring(text.indexOf("f"), 12);
        System.out.println(s3);
    }
}
