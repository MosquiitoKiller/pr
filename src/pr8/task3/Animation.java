package pr8.task3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class Animation extends JFrame {
    int width = 500, height = 500;
    JPanel pnl = new JPanel();
    public Animation(){
        setTitle("Animation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width,height);
        setVisible(true);

        Graphics g;
        Image img;

        ArrayList<Image> images = new ArrayList<>();
        for (int i = 0; i <= 7; i++) images.add(new ImageIcon("C:/Users/Максим/Desktop/Лабы/gif/" + i + ".png").getImage());

        while(true){
            for (int i = 0; i < 8; i++){
                img = images.get(i);
                g = getGraphics();
                g.drawImage(img,0,0, width, height,null);
                timeDelay();
            }
        }
    }

    private void timeDelay(){
        try {
            Thread.sleep(50);
        }
        catch (InterruptedException e){}
    }

    public static void main(String[]args){
        new Animation();
    }
}
