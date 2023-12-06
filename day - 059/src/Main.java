import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) throws Exception {

        

        JFrame frame = new JFrame("Buttons");

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setLayout(null);

        JButton button1 = new JButton("TOMBOL");
        button1.setSize(200, 200);
        button1.setBounds(300, 300, 200, 200);
        button1.addActionListener(new ActionListener() {
            int  increment= 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                increment++;
                System.out.println("Hello "+increment);
            }
            
        });
        frame.add(button1);
    }
}
