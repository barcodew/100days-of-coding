import javax.swing.JFrame;

public class Window {
    public static void main(String[] args) throws Exception {

        JFrame jf = new JFrame();

        jf.setLocationRelativeTo(null);
        jf.setTitle("Ini Window");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(800,800);
        jf.setVisible(true);
    }
}
