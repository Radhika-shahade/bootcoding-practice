package typecasting;

public class PenApp {
    public static void main(String[] args) {
        Pen p= new MarkerPen();
        p.display(22.40);
        WhiteMarker wm= new WhiteMarker();
        wm.companyName();
        wm.colour("blue");
        wm.display(30);
        Pen obj= new WhiteMarker();
        System.out.println("Type casting");
        WhiteMarker wm1= (WhiteMarker) p;  //casting  parent class method is calling
        wm1.display(33);// pen means parent class method is calling
        GelPen gelpen = (GelPen) new Pen();
        gelpen.display(20);  // pen class method
        gelpen.colourOfPen("black"); // gelpen class method




    }
}
