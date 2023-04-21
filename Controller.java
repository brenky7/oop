package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller extends JFrame implements ActionListener {
    JButton button;
    JButton button2;
    JLabel label;
    JLabel welcomeLabel;
    public Controller(String username) {
        label = new JLabel("Autobusy boli vytvorene");
        label.setBounds(50, 0, 200, 30);
        label.setVisible(false);
        ImageIcon myIcon = new ImageIcon("logo2.png");

        welcomeLabel = new JLabel("Vitajte " + username);
        welcomeLabel.setBounds(50, 45, 200, 150);
        welcomeLabel.setVisible(true);

        button = new JButton("Autobusy");
        button.setBounds(50, 350, 100, 100);
        button.setBackground(Color.cyan);
        button.setIcon(myIcon);
        button.setVisible(true);
        button.addActionListener(this);

        button2 = new JButton("Cestujuci");
        button2.setBounds(50, 500, 100, 100);
        button2.setBackground(Color.cyan);
        button2.setVisible(true);
        button2.addActionListener(this);

        this.setTitle("SlovakWheels");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(800, 800);
        this.getContentPane().setBackground(Color.cyan);
        this.setResizable(false);
        this.setVisible(true);
        this.add(button);
        this.add(button2);
        this.add(label);
        this.add(welcomeLabel);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Autobusy");
            welcomeLabel.setVisible(false);
            label.setVisible(true);
        }
        if (e.getSource() == button2) {
            System.out.println("Cestujuci");
        }
    }
}
