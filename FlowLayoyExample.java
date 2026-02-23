import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.logging.Handler;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoyExample {
FlowLayoyExample(){
    JFrame f = new JFrame("flow Layout");
    JButton b1 = new JButton("button1");
    JButton b2 = new JButton("button2");
    JButton b3 = new JButton("button3");
    JButton b4 = new JButton("button4");
    JButton b5 = new JButton("button5");
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(b5);

    f.setLayout(new FlowLayout(FlowLayout.CENTER));
    f.setSize(300, 300);
    f.setVisible(true);
    
}

public static void main(String[] args){
    new FlowLayoyExample();
}
    
}