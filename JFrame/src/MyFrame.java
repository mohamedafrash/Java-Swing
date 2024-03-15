import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("My First JFrame");  // Sets title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit on close(X)
        this.setSize(360,360);// Sets the Dimension/Size
        this.setResizable(false);
        this.setVisible(true);

        ImageIcon img = new ImageIcon("C:\\Users\\afraz\\Downloads\\1.jpg"); //create an ImageIcon
        this.setIconImage(img.getImage()); //change icon of this
        this.getContentPane().setBackground(new Color(0x3495eb)); //Sets the Background COlor

    }
}
