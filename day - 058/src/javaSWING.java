import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class javaSWING {
    public static void main(String[] args) {
        JFrame window = new JFrame("INI WINDOW JAVA SWING");

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.setSize(500, 500);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        JLabel labelSWING = new JLabel("INI LABEL SWING");

        labelSWING.setBounds(150, 150, 100, 100);

        window.add(labelSWING);
    }
}
