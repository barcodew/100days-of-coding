import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MembuatButtonDenganAksi extends JFrame {
    JButton tombol;
    int increment =0;
    MembuatButtonDenganAksi(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("Button Action");

        tombol = new JButton("Klik Saya");

        tombol.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                increment++;
                System.out.println("Saya Diklik "+increment);
            }
            
        });

        add(tombol);
    }
    public static void main(String[] args) throws Exception {
        EventQueue.invokeLater(
            new Runnable() {

                @Override
                public void run() {
                   new MembuatButtonDenganAksi();
                }
                
            }

        );
    }
}
