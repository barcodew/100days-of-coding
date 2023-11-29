import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class iniPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.cyan);
        g2d.fillRect(10,200, 200, 200);
        g2d.setColor(Color.GREEN);
        g2d.fillRect(210,200, 200, 200);
        g2d.setColor(Color.RED);
        g2d.fillOval(410, 200, 200, 200);
        g2d.setColor(Color.BLACK);
        g2d.fillOval(610, 200, 200, 200);
        g2d.dispose();
    }

    
    
}
