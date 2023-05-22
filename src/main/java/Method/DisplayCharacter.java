package Method;

public class DisplayCharacter {
    public void displayMiddleCharacter(String s)
    {
       int i=s.length()/2;
        System.out.println(s.charAt(i));
    }

    public static void main(String[] args) {
        DisplayCharacter  result= new DisplayCharacter();
        result.displayMiddleCharacter("2456673");


    }
}
