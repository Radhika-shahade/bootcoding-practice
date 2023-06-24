package arryofobjects.watches;

public class WatchApp {
    public static void main(String[] args) {
        Watch[]watches=new Watch[4];
        watches[0]=new WallWatch("Titan",4000);
         watches[1]=new Watch("MI");
         watches[2]=new Wristwatch("Sonata","circular");
         watches[3]=new WallWatch("Casio",3000);
         for(int i=0;i<watches.length;i++)
         {
             watches[i].display();
         }

    }
}
