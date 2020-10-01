package pr8.task2;

import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    static Image img;
    public static void main(String[] args) {
        img = new ImageIcon(args[0]).getImage();
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(new Main());
    }
    public void paintComponent(Graphics g){
        g.drawImage(img, 0, 0, null);
    }
}