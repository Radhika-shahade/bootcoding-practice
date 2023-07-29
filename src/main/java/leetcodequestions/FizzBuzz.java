package src.main.java.leetcodequestions;

import java.util.ArrayList;
import java.util.List;

//Que-412
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String>res=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if((i%3==0)&&(i%5==0))
            {
                res.add("FizBuzz");
            }
           else if(i%3==0)
            {
                res.add("Fizz");
            }
           else if(i%5==0)
            {
                res.add("Buzz");
            }
            else
                res.add(i+" ");

        }

        System.out.println(res);
        return res;

    }

    public static void main(String[] args) {
        FizzBuzz fb= new FizzBuzz();
        fb.fizzBuzz(3);
    }
}
