//Title screen 

import java.awt.*;
import javax.swing.*;


public class CheckersTitle{
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private JLabel label = new JLabel("Checkers");
    private JButton playerButton = new JButton();
    private JButton options = new JButton("Options");

    public CheckersTitle(){
    frame.add(panel);
    panel.add(label);
    panel.add(playerButton);
    panel.add(options);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400,600);
    frame.setVisible(true);
    }

    public static void main(String[] args){
        CheckersTitle title = new CheckersTitle();
    }
//we can go back later and create layouts to make the buttons more centered

}
