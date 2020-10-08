package pr8.task2;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main extends JPanel {
    static Image img;
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        img = new ImageIcon(scanner.nextLine()).getImage();
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(new Main());
    }
    public void paintComponent(Graphics g){
        g.drawImage(img, 0, 0, null);
    }
}
//C:/Users/Максим/Desktop/unnamed.png