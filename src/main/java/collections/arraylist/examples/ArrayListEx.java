package collections.arraylist.examples;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        int []elements= new int[2];
        elements[0]=10;
        elements[1]=20;
       //it allows different types of values means different data types
        //The determination of the object class as the parent class is made at compile time
        ArrayList arraylist= new ArrayList();
        arraylist.add(20);
        arraylist.add("rina");
        arraylist.add('a');
        arraylist.add(true);
        System.out.println(arraylist);

        ArrayList<Integer> intData= new ArrayList<>();
        intData.add(20);
        intData.add(36);
        for(int i=0;i<intData.size();i++)
        {
            System.out.println(intData.get(i));
        }
    }
}
