import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventExample extends JFrame implements MouseListener {

    JLabel label ;
    
    public MouseEventExample(){

        //  create lebel 
        label = new JLabel("Mouse event example");
        label.setBounds(50,50, 300,300);

        // add listener 
        addMouseListener(this);

        // Frame setting 
        setTitle("Mouse event example");
        setSize(400, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(label);
        setVisible(true);

        //  mouseListener methods 

        
    }
    public void mouseClicked(MouseEvent e){
        label.setText("mouse clicked at: " +e.getX()+ ", "+e.getY());

    }

     public void mousePressed(MouseEvent e){
        label.setText("mouse pressed at: " );
     }
      public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered Window");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited Window");
    }

    public static void main(String[] args){
        new MouseEventExample();
    }
}
