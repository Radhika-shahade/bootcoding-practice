package arraypractice;
//Take names array and add prefix Dr. to all elements
public class addPrefix {
    public static void main(String[] args) {
       String name[]= {"Rajesh", "Tushar", "Anil", "Megha"};
       for(int i=0;i<name.length;i++)
       {
           name[i]= "Dr."+ name[i];
           System.out.println(name[i]);
       }
    }
}
