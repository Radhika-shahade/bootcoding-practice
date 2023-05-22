package Method;

public class FindingEvenAndOdd {
    public void checkingEvenAndOdd(int num)
    {
    if(num%2==0)
    {
        System.out.println(  num +" is Even number ");
    }
    else {
        System.out.println(+num+ " is odd number ");
    }
    }

    public static void main(String[] args) {
        FindingEvenAndOdd result= new FindingEvenAndOdd();
        result.checkingEvenAndOdd(9);
    }

}
