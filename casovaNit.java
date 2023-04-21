package gui;

import javax.swing.*;

public class casovaNit implements Runnable {
    public JLabel label;
    public casovaNit(JLabel label) {
        this.label = label;
    }
    public void run() {
        label.setVisible(true);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        label.setVisible(false);
    }
}

