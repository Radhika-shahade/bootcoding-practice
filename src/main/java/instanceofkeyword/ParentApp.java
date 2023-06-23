package instanceofkeyword;

import javax.swing.*;
import java.sql.SQLOutput;

public class ParentApp {
    public static void main(String[] args) {
        Parent pp= new Parent();
        Child cc= new Child();
        System.out.println(pp instanceof Parent);
        System.out.println(pp instanceof Child);
        System.out.println(cc instanceof Child);
    }
}
