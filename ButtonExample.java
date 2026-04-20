package Swings;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonExample {

    JLabel l1;

    ButtonExample() {

        JFrame f = new JFrame("Button Example");

        // Label
        l1 = new JLabel("Click a button", JLabel.CENTER);
        l1.setBounds(50, 30, 300, 60);
        l1.setFont(new Font("Arial", Font.BOLD, 18));

        // Buttons
        JButton b1 = new JButton("India");
        JButton b2 = new JButton("Sri Lanka");

        b1.setBounds(50, 120, 120, 40);
        b2.setBounds(200, 120, 120, 40);

        // Action for Button 1
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("India is pressed");
            }
        });

        // Action for Button 2
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("Sri Lanka is pressed");
            }
        });

        // Add components
        f.add(b1);
        f.add(b2);
        f.add(l1);

        // Frame settings
        f.setSize(400, 250);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonExample();
    }
}