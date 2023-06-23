package typecasting;

public class PenApp {
    public static void main(String[] args) {
        Pen p= new MarkerPen();
        p.display(22.40);
        WhiteMarker wm= new WhiteMarker();
        wm.companyName();
        wm.colour("blue");
        wm.display(30);
        Pen p2=wm;
        Pen obj= new WhiteMarker();
        System.out.println("Type casting");
        //child class is cast to parent it possible
        System.out.println("child class cast to parent");
        Pen pp = (Pen)wm;
        pp.display(33);

        // parent class is cast to child class is not possible that's why exception "class cast exception occur"
        System.out.println("Parent class is cast to child");
        WhiteMarker wm1= (WhiteMarker) p;  //casting  parent class method is calling
        wm1.display(33);// pen means parent class method is calling
        GelPen gelpen = (GelPen) new Pen();
        gelpen.display(20);  // pen class method
        gelpen.colourOfPen("black"); // gelpen class method





    }
}
