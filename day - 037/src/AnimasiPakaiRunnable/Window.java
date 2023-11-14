package AnimasiPakaiRunnable;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JPanel{
    public static void main(String[] args) {
        JFrame jf = new JFrame("INI JENDELA?");

        iniContentPanel panel = new iniContentPanel();

        jf.getContentPane().add( panel);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(800,800);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
}
