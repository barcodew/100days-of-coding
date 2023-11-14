package AnimasiPakaiRunnable;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class iniContentPanel extends JPanel implements Runnable {

    int koordinatX = 100;
    int koordinatY = 100;

    Thread threads;

    public void update() {
        koordinatX += 2;
        koordinatY += 2;
    }

    @Override
    public void addNotify() {
        super.addNotify();
        threads = new Thread(this);
        threads.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics g2d = (Graphics) g;
        g2d.setColor(Color.CYAN);
        // g2d.fillOval(koordinatX, koordinatY, 100, 100);
        g2d.fillRect(koordinatX, koordinatY, 100,100);
        g2d.setColor(Color.BLACK);
        g2d.drawString("Achmad Ali Akbar", koordinatX, koordinatY);
        g2d.dispose();
    }

    @Override
    public void run() {
        while (true) {
            update();
            repaint();
            try {
                threads.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
