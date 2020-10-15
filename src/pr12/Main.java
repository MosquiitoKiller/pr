package pr12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    public Main(){
        setTitle("Planets");
        JButton[] buttons = new JButton[8];
        JTextArea textArea = new JTextArea();
        JTextArea textInfo = new JTextArea();
        final int deltaX=180,Y=20,widthButton=150,heightButton=20;
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textInfo.setBounds(500,5,500,15);
        textInfo.setText("Учитывайте существующую погрешность измерений и компьютера");
        add(textInfo);
        textInfo.setEditable(false);
        setSize(deltaX*9,500);
        Planet[] planets = Planet.values();
        for(int i=0;i<buttons.length;++i) {
            buttons[i] = new JButton(planets[i].getName());
            buttons[i].setBounds(deltaX*i+20, Y, widthButton, heightButton);
            add(buttons[i]);
        }
        textArea.setBounds(500,50,500,100);
        add(textArea);
        textArea.setEditable(false);
        for (int i=0;i<buttons.length;++i) {
            int finalI = i;
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String s = String.format("%s\nmas = %.0f kg\nrad = %.0f km\ngravity = %.3f m/s^-2", planets[finalI].getName(), planets[finalI].getM(), planets[finalI].getR(), planets[finalI].getGravity());
                    textArea.setText(s);
                }
            });
        }
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
