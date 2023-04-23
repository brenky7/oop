package gui;

import main.matchMaking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller extends JFrame implements ActionListener {
    userData data;
    JButton button;
    JButton button2;
    JButton logoutButton;
    JTextArea textArea;
    JTextArea textArea2;
    JLabel label;
    JLabel label2;
    JComboBox comboBox;
    JComboBox comboBox2;
    User user;
    public Controller(userData data, User user) {
        ImageIcon myIcon = new ImageIcon("logo2.png");
        this.user = user;
        this.data = data;
        textArea = new JTextArea("Vitajte " + user.getName(), 5, 25);
        textArea.setBounds(50, 45, 200, 150);
        textArea.append("\nBudget: " + user.getBudget() + "€");
        textArea.append("\nVybrany spoj: " + "\n" + user.getKoniecTrasy() + "\n" + user.getCasOdchodu());
        textArea.setVisible(true);
        textArea.setEditable(false);

        label = new JLabel("Vyberte si typ autobusu");
        label.setBounds(315, 50, 160, 30);
        label.setVisible(true);

        comboBox = new JComboBox();
        comboBox.setBounds(280, 50, 220, 150);
        comboBox.addItem("Medzistatny - Nemecko");
        comboBox.addItem("Medzistatny - Madarsko");
        comboBox.addItem("Vnutrostatny - Kosice");
        comboBox.addItem("Vnutrostatny - Zilina");
        comboBox.addItem("Vnutrostatny - Prievidza");
        comboBox.addItem("Comfort Mini - Martin");
        comboBox.addItem("Comfort Mini - Skalica");
        comboBox.addItem("Comfort Mini - Detva");
        comboBox.setVisible(true);

        button = new JButton("Vybrat");
        button.setBounds(280, 150, 220, 30);
        button.addActionListener(this);
        button.setVisible(true);

        comboBox2 = new JComboBox();
        comboBox2.setBounds(550, 50, 200, 150);
        comboBox2.setVisible(false);

        label2 = new JLabel("Vyberte si cas odchodu");
        label2.setBounds(575, 50, 150, 30);
        label2.setVisible(false);

        button2 = new JButton("Vybrat");
        button2.setBounds(550, 150, 200, 30);
        button2.addActionListener(this);
        button2.setVisible(false);

        textArea2 = new JTextArea("Informacie o ceste", 30, 25);
        textArea2.setBounds(50, 250, 700, 400);
        textArea2.setVisible(false);

        logoutButton = new JButton("Logout");
        logoutButton.setBounds(650, 700, 100, 30);
        logoutButton.addActionListener(this);
        logoutButton.setVisible(true);

        this.setTitle("SlovakWheels");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(800, 800);
        this.getContentPane().setBackground(Color.cyan);
        this.setResizable(false);
        this.setVisible(true);
        this.add(button);
        this.add(button2);
        this.add(logoutButton);
        this.add(textArea);
        this.add(comboBox);
        this.add(comboBox2);
        this.add(label2);
        this.add(label);
        this.add(textArea2);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            button2.setVisible(true);
            label2.setVisible(true);
            if(comboBox.getItemAt(comboBox.getSelectedIndex()).equals("Medzistatny - Nemecko")||comboBox.getItemAt(comboBox.getSelectedIndex()).equals("Medzistatny - Madarsko")){
                comboBox2.removeAllItems();
                comboBox2.addItem("07:00");
                comboBox2.addItem("11:00");
                comboBox2.addItem("15:00");
                comboBox2.setVisible(true);
            }
            else if(comboBox.getItemAt(comboBox.getSelectedIndex()).equals("Vnutrostatny - Kosice")||comboBox.getItemAt(comboBox.getSelectedIndex()).equals("Vnutrostatny - Zilina")||comboBox.getItemAt(comboBox.getSelectedIndex()).equals("Vnutrostatny - Prievidza")){
                comboBox2.removeAllItems();
                comboBox2.addItem("07:00");
                comboBox2.addItem("09:00");
                comboBox2.addItem("11:00");
                comboBox2.addItem("13:00");
                comboBox2.addItem("15:00");
                comboBox2.setVisible(true);
            }
            else if(comboBox.getItemAt(comboBox.getSelectedIndex()).equals("Comfort Mini - Martin")||comboBox.getItemAt(comboBox.getSelectedIndex()).equals("Comfort Mini - Skalica")||comboBox.getItemAt(comboBox.getSelectedIndex()).equals("Comfort Mini - Detva")){
                comboBox2.removeAllItems();
                comboBox2.addItem("07:00");
                comboBox2.addItem("09:00");
                comboBox2.addItem("11:00");
                comboBox2.addItem("13:00");
                comboBox2.setVisible(true);
            }
        }
        if (e.getSource() == button2) {
            String spoj = (String) comboBox.getItemAt(comboBox.getSelectedIndex());
            String[] parts = spoj.split(" - ");
            user.setKoniecTrasy(parts[1]);
            user.setCasOdchodu((String) comboBox2.getItemAt(comboBox2.getSelectedIndex()));
            textArea.setText("Vybrany spoj:" + "\n" + user.getKoniecTrasy() + "\n" + user.getCasOdchodu());
            data.getLoginInfo().get(user.getName()).setKoniecTrasy(user.getKoniecTrasy());
            data.getLoginInfo().get(user.getName()).setCasOdchodu(user.getCasOdchodu());
            fileEdit fileEdit = new fileEdit(data, user);
            //matchMaking matchuj = new matchMaking(user);
        }
        if (e.getSource() == logoutButton) {
            this.dispose();
            new loginController(data);
        }
    }
}
