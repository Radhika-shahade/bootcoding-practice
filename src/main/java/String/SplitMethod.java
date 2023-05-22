package String;

public class SplitMethod {
    public static void main(String[] args) {
        String text = "Totalfoldersingiven";
        System.out.println(text);
        String substring = text.substring(5);// index 5 is included
        System.out.println(substring);
        String substring2= text.substring(0,5); //answer is between this index position
        System.out.println(substring2);
        int len= text.length();
        String s3= text.substring(len-5);// output begins with answer of len-5
        System.out.println(s3);
        String name="radhikashahade";
        int size =name.length();
        String substring3= name.substring(size-4);

        System.out.println(substring3);
        String name1= name.substring(5,8);
        System.out.println(name1);
        String quote =    "coloumns= \"coloumns\""; // Escape Sequence
        System.out.println(quote);
//                "[columns]=\"columns\"";
    }

}
