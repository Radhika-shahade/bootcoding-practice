package src.main.java.casting.nonpremitivecasting;

public class ParentApp {
    public static void main(String[] args) {
        Parent pp= new Parent();
        Child cc= new Child();
        Parent obj =(Parent)cc;//up casting (Parent reference variable is equal to child object)
        Child ch=(Child)obj; //down casting (this is valid)
        ch.m1();
        obj.m1(); // child class method is running


 // if i create a new object of parent and trying to cast parent class obj into child is not valid
        //Child class reference variable cannot hold the parent object
        Parent res= new Parent();
       Child ccc =(Child)res;//down casting
        ccc.m1();
    }
}
