package Swings;

import javax.swing.*;
import java.awt.event.*;

public class ImageButtonExample {

    JFrame f;
    JLabel l;

    ImageButtonExample() {

        // Frame
        f = new JFrame("Image Button Example");

        // Label
        l = new JLabel("Click a button", JLabel.CENTER);
        l.setBounds(50, 20, 300, 30);

        // Load Images (place images in project folder)
        ImageIcon digitalIcon = new ImageIcon("digital_clock.jpg");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.jpg");

        // Buttons with images
        JButton b1 = new JButton(digitalIcon);
        JButton b2 = new JButton(hourglassIcon);

        b1.setBounds(50, 70, 120, 120);
        b2.setBounds(200, 70, 120, 120);

        // Action Listener for Digital Clock
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("Digital Clock is pressed");
            }
        });

        // Action Listener for Hour Glass
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("Hour Glass is pressed");
            }
        });

        // Add components
        f.add(l);
        f.add(b1);
        f.add(b2);

        // Frame settings
        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}