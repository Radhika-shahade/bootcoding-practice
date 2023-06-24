package arryofobjects.Shape;

public class Main {
    public static void main(String[] args) {
        Shapes[] obj= new Shapes[5];
        obj[0]=new Shapes("black");
        obj[1]=new Circle("yello",2.3);
        obj[2]=new Rectangle("Blue",2,5);
        obj[3]=new Circle("green",3.5);
        obj[4]=new Rectangle("white",3,6);
        for(int i=0;i< obj.length;i++)
        {
          obj[i].draw();
        }
    }
}
