package pr9;


import pr8.task1.Arc;
import pr8.task1.Circle;
import pr8.task1.Rect;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    private Circle circle;
    private Rect rect;
    private Arc arc;
    public Main(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 450);
        setResizable(false);
        JPanel panel = new JPanel();
        JButton button = new JButton("press me!");
        button.setSize(100, 20);
        panel.add(button);
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                for (int i = 0; i < 20; i++){
                        switch((int)(Math.random()*3)){
                            case 0:
                                circle = new Circle();
                                add(circle);
                                break;
                            case 1:
                                rect = new Rect();
                                add(rect);
                                break;
                            case 2:
                                arc=new Arc();
                                add(arc);
                                break;
                        }
                        setVisible(true);

                }
            }
        };
        button.addActionListener(actionListener);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}