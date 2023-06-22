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
        obj=wm;



    }
}
