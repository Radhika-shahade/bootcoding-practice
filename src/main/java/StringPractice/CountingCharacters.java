package StringPractice;

public class CountingCharacters {
    public static void main(String[] args) {
        String inputString="Hello world!";
        int length=inputString.length();
        System.out.println("Number of character are: " + length);
    }

    public static class ArrayContains {
        public void findingSpecificElements(int a[])
        {
            int target=3;
            for(int i=0;i<a.length;i++)
            {
                if(a[i]==target)
                {
                    System.out.println("array contains target element");
                }
    
                }
    
            }
    
    
        public static void main(String[] args) {
            ArrayContains ac= new ArrayContains();
            int b[]={6,4,5,6,7};
            ac.findingSpecificElements(b);
    
        }
    
    }
}
