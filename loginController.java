package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.util.*;

public class loginController implements ActionListener {
    HashMap<String, String> loginInfo = new HashMap<String, String>();
    JFrame frame = new JFrame("Login or Register");
    JLabel loginLabel = new JLabel("Login");
    JLabel registerLabel = new JLabel("Register");
    JTextField usernameField = new JTextField();
    JTextField usernameField2 = new JTextField();
    JLabel usernameLabel = new JLabel("Type your username here ->");
    JLabel usernameLabel2 = new JLabel("Type your username here ->");
    JPasswordField passwordField = new JPasswordField();
    JPasswordField passwordField2 = new JPasswordField();
    JLabel passwordLabel = new JLabel("Type your password here ->");
    JLabel passwordLabel2 = new JLabel("Type your password here ->");
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JButton registerButton = new JButton("Register");
    JLabel messageLabel = new JLabel();
    public loginController(HashMap<String, String> loginInfoGlobal) {
        loginInfo = loginInfoGlobal;

        loginLabel.setBounds(300, 5, 200, 15);
        registerLabel.setBounds(300, 215, 200, 15);

        usernameField.setBounds(350, 50, 200, 30);
        usernameLabel.setBounds(60, 50, 300, 30);
        passwordField.setBounds(350, 100, 200, 30);
        passwordLabel.setBounds(60, 100, 300, 30);

        loginButton.setBounds(350, 150, 100, 30);
        loginButton.addActionListener(this);
        resetButton.setBounds(460, 150, 100, 30);
        resetButton.addActionListener(this);

        usernameField2.setBounds(350, 250, 200, 30);
        usernameLabel2.setBounds(60, 250, 300, 30);
        passwordField2.setBounds(350, 300, 200, 30);
        passwordLabel2.setBounds(60, 300, 300, 30);

        registerButton.setBounds(400, 350, 100, 30);
        registerButton.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(Color.cyan);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(usernameField);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(messageLabel);
        frame.add(usernameLabel);
        frame.add(passwordLabel);
        frame.add(usernameField2);
        frame.add(passwordField2);
        frame.add(usernameLabel2);
        frame.add(passwordLabel2);
        frame.add(loginLabel);
        frame.add(registerLabel);
        frame.add(registerButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == resetButton) {
            usernameField.setText("");
            passwordField.setText("");
        }
        if(e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = String.valueOf(passwordField.getPassword());
            if(loginInfo.containsKey(username)) {
                if(loginInfo.get(username).equals(password)) {
                    messageLabel.setBounds(60, 175, 300, 30);
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login successful");
                    frame.dispose();
                    Controller controller = new Controller(username);
                } else {
                    messageLabel.setBounds(60, 175, 300, 30);
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong password");
                    casovaNit casovaNit = new casovaNit(messageLabel);
                    Thread casovaNitThread = new Thread(casovaNit);
                    casovaNitThread.start();

                }
            } else {
                messageLabel.setBounds(60, 175, 300, 30);
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Wrong username");
                casovaNit casovaNit = new casovaNit(messageLabel);
                Thread casovaNitThread = new Thread(casovaNit);
                casovaNitThread.start();
            }
        }
        if (e.getSource()==registerButton){
            String username = usernameField2.getText();
            String password = String.valueOf(passwordField2.getPassword());
            if(loginInfo.containsKey(username)) {
                messageLabel.setBounds(60, 375, 300, 30);
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Username already exists");
                casovaNit casovaNit = new casovaNit(messageLabel);
                Thread casovaNitThread = new Thread(casovaNit);
                casovaNitThread.start();
            } else {
                loginInfo.put(username, password);
                messageLabel.setBounds(60, 375, 300, 30);
                messageLabel.setForeground(Color.green);
                try {
                    FileWriter myWriter = new FileWriter("userInfo.txt", true);
                    //myWriter.append("\n");
                    myWriter.write("\n" + username + " " + password);
                    myWriter.close();
                }
                catch (Exception ex) {
                    System.out.println(ex);
                }
                messageLabel.setText("Registration successful");
                casovaNit casovaNit = new casovaNit(messageLabel);
                Thread casovaNitThread = new Thread(casovaNit);
                casovaNitThread.start();
                frame.dispose();
                Controller controller = new Controller(username);
            }
        }
    }
}
