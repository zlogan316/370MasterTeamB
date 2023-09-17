//Title screen 

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class CheckersTitle{
    JFrame frame;
    Container con;
    JPanel titlePanel, OptionsPanel, optionsButtonPanel;
    JLabel titleLabel, OptionsLabel;
    JButton optionsButton;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);

    ScreenHandler sHandler = new ScreenHandler();

    public static void main(String[] args){
        new CheckersTitle();
    }


    public CheckersTitle(){
        frame = new JFrame();
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        con = frame.getContentPane();

        titlePanel = new JPanel();
        titlePanel.setBounds(0, 0, 600, 200);
        titlePanel.setBackground(Color.black);
        titleLabel = new JLabel("Checkers!");
        titleLabel.setFont(titleFont);
        titleLabel.setForeground(Color.white);


        optionsButtonPanel = new JPanel();
        optionsButtonPanel.setBounds(250, 200, 100, 50);

        optionsButton = new JButton("OPTIONS");
        optionsButton.addActionListener(sHandler);

        titlePanel.add(titleLabel);
        optionsButtonPanel.add(optionsButton);

        con.add(titlePanel);
        con.add(optionsButtonPanel);
    }

    public void createOptionScreen(){
        titlePanel.setVisible(false);
        optionsButtonPanel.setVisible(false);

        JPanel optionTitlePanel = new JPanel();
        optionTitlePanel.setBounds(0, 0, 600, 200);
        optionTitlePanel.setBackground(Color.BLACK);

        JLabel optionTitleLabel = new JLabel("Options:");
        optionTitleLabel.setFont(titleFont);

        optionTitlePanel.add(optionTitleLabel);

        con.add(optionTitlePanel);
    }

    public class ScreenHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            createOptionScreen();
        }
    }
//we can go back later and create layouts to make the buttons more centered

}
