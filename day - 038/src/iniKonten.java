import java.awt.Graphics;

import javax.swing.JPanel;

public class iniKonten extends JPanel {

    int koordinatX = 100;
    int koordinatY = 100;
    Thread forSleep;

    public void update() {
        koordinatY += 2;
    }

    public void sleep(int slp) {
        try {
            forSleep.sleep(slp);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics g2d = (Graphics) g;
        g2d.fillOval(koordinatX, koordinatY, 200, 200);
        g2d.dispose();
    }

}
