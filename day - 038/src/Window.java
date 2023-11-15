import javax.swing.JFrame;

public class Window extends Thread {
    iniConten panel;
    Thread iniThread;

    public Window(){
        panel = new iniConten();
        iniThread = new Thread(this);
        iniThread.start();
    }
    
    @Override
    public void run() {
        while (true) {
            panel.update();
            panel.repaint();
            panel.sleep(10);
        }
    }

    public static void main(String[] args) {
        Window animasi = new Window();
        JFrame jf = new JFrame("Animasi Menggunakan Thread");

        jf.getContentPane().add(animasi.panel);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(800,800);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
}
