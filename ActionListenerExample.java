import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionListenerExample extends JFrame implements ActionListener{

    JButton button;
    JLabel label;
    
    public ActionListenerExample(){
        button = new JButton("click me!");
        button.setBounds(100, 100, 100, 40);
        label = new JLabel("Button is not clicked");
        label.setBounds(80, 40, 200, 50);

        button.addActionListener(this);
        add(button);
        add(label);

        setSize(300, 280);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        label.setText("Button clicked!");
    }

    public static void main(String[] args){
        new ActionListenerExample();
    }

}
