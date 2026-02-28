import javax.swing.*;
public class SwingMenu {

    JMenu menu,  file ,submenu;
    JMenuItem i1, i2, i3, New, Save;

    SwingMenu(){
        JFrame f = new JFrame("menu and menu items");

        JMenuBar mb = new JMenuBar();

        menu = new JMenu("Menu");
        submenu = new JMenu("Sub menu");
        file = new JMenu("File");
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        Save = new JMenuItem("Save");
        New = new JMenuItem("New");

        menu.add(i1);
        submenu.add(i2);
        submenu.add(i3);
        menu.add(submenu);
        file.add(New);
        file.add(Save);
        mb.add(menu);
        mb.add(file);
        f.setJMenuBar(mb);
        f.setSize(300, 300);
        f.setVisible(true);

       

    }
     public static void main(String[] args){
            new SwingMenu();
        }
}