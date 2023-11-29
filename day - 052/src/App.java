import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        iniPanel panel = new iniPanel();

        JFrame JF = new JFrame();
        JF.getContentPane().add(panel);
        JF.setVisible(true);

        JF.setTitle("ini Window");
        JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JF.setSize(800,800);
        JF.setVisible(true);
    }
}
