import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Ini Judul");
        ImageIcon iconImage = new ImageIcon("D:\\Learning\\100 Days Of Coding\\day - 053\\src\\iniLogo.jpg");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setIconImage(iconImage.getImage());
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.decode("#7B66FF"));
        frame.setLocationRelativeTo(null);

    }
}
