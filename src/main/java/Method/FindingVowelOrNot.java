package Method;

public class FindingVowelOrNot {
    public boolean isVowel(char ch) {

    return ch =='a' || ch=='e' || ch=='i'|| ch=='o'|| ch =='u';
    }

    public static void main(String[] args) {
        FindingVowelOrNot result= new  FindingVowelOrNot();
       boolean ans= result.isVowel('a');
        System.out.println(ans);
    }
}
