package src.main.java.recursion;

public class CountOfDigit {

    public  int countOfDigit(int num)
    {
        if(num==0)
        {
            return 0;
        }


     return 1+ countOfDigit( num/10);
    }

    public static void main(String[] args) {
        CountOfDigit obj= new CountOfDigit();
        System.out.println(obj.countOfDigit(12345));
    }
}
