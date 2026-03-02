import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToolBarExample {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("JToolBar Example");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create Toolbar
        JToolBar toolBar = new JToolBar();
        toolBar.setFloatable(true);   // Allow dragging
        toolBar.setRollover(true);    // Hover effect

        // Create Buttons
        JButton btnNew = new JButton("New");
        JButton btnSave = new JButton("Save");
        JButton btnExit = new JButton("Exit");

        // Add Buttons to Toolbar
        toolBar.add(btnNew);
        toolBar.add(btnSave);
        toolBar.addSeparator();   // Adds space
        toolBar.add(btnExit);

        // Add Action Listeners
        // btnNew.addActionListener(e -> 
        //     JOptionPane.showMessageDialog(frame, "New File Created"));

        // btnSave.addActionListener(e -> 
        //     JOptionPane.showMessageDialog(frame, "File Saved"));

        // btnExit.addActionListener(e -> 
        //     System.exit(0));

        // Add Toolbar to Frame (Top)
        frame.add(toolBar, BorderLayout.NORTH);

        frame.setVisible(true);
    }
}