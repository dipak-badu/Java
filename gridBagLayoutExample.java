import java.awt.*;
import javax.swing.*;

public class gridBagLayoutExample {

    public static void main(String[] args){
       
        JFrame f = new JFrame("GridBag layout example");

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cst = new GridBagConstraints();
        cst.insets = new Insets(1, 2, 3, 4);
        //* add button 1 tp panel
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 0;
        cst.gridy =0;
        cst.ipadx = 2;
        cst.ipady =2;
        panel.add(b1, cst);

        //* add b2 to pannel
        cst.fill = GridBagConstraints.VERTICAL;
        cst.gridx = 1;
        cst.gridy =0;
        cst.ipadx = 2;
        cst.ipady =2;
    
        panel.add(b2, cst);


 //*   b3 to pannel
         cst.fill = GridBagConstraints.VERTICAL;
        cst.gridx = 0;
        cst.gridy =1;
        cst.ipadx = 2;
        cst.ipady =2;
    
        panel.add(b3, cst);


        f.setSize(300,200);
        f.getContentPane().add(panel);
        f.setVisible(true)
        ;
    }
}