package Method;

public class SwitchCase {
    public static boolean checkingVowelsOrNot(char ch) {
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;


        }


    }

    public static void main(String[] args) {
        boolean result =checkingVowelsOrNot('i');
        System.out.println(result);
    }
}
