import java.awt.*;
import javax.swing.*;

public class GridLayoutExample {

    JButton b1, b2, b3, b4, b5, b6;

    GridLayoutExample(){
        JFrame f = new JFrame();

        b1 = new JButton("A");
        b2 = new JButton("B");
        b3 = new JButton("C");
        b4 = new JButton("D");
        b5 = new JButton("E");
        b6 = new JButton("F");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
           
        f.setLayout((new GridLayout(2,3)));
        f.setSize(600,600);
        f.setVisible(true);

    }
    public static void  main(String[]  args){
        new GridLayoutExample();
    }
}