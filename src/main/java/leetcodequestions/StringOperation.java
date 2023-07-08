package src.main.java.leetcodequestions;
//2011.Final Value of Variable After Performing Operations
//Input: operations = ["--X","X++","X++"]
//Output: 1
//Initially, X = 0.
public class StringOperation {
    public int finalValueAfterOperations(String[] operations) {
        int x =0;
        for(String operation:operations)
        {
            if(operation.contains("++"))
            {
                x++;
            }
            if(operation.contains("--"))
            {
                x--;
            }
        }
        return x;

    }

    public static void main(String[] args) {
        String s[]={"--X","X++","X++"};
        StringOperation obj= new StringOperation();
        System.out.println(obj.finalValueAfterOperations(s));
    }


}
