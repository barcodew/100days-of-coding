import javax.swing.JFrame;

public class Window extends Thread{

    iniKonten panel;
    Thread iniThread;

    public Window(){
        panel = new iniKonten();
        iniThread = new Thread(this);
        iniThread.start();
    }

    @Override
    public void run() {
        while (true) {
            panel.update();
            panel.repaint();
            panel.sleep(100);
        }
    }




    public static void main(String[] args) {

        Window animasi = new Window();
        JFrame jf = new JFrame("Animasi Menggunakan Thread");

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.getContentPane().add(animasi.panel);
        jf.setSize(800,800);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
}
