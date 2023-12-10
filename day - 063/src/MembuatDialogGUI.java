import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MembuatDialogGUI extends JFrame {
    JButton tombol1;
    JPanel showDialog;
    JDialog dialog1;

    MembuatDialogGUI(){
        initUI();
        
        tombol1 = new JButton("Tombol Dialog");
        tombol1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Dialog();
            }
            
        });

        add(tombol1);
    }

    private void Dialog(){
        dialog1 = new JDialog();
        dialog1.setSize(400,400);
        dialog1.getContentPane().setBackground(Color.cyan);
        dialog1.setTitle("Ini Dialog Didalam Tombol");
        dialog1.setVisible(true);
    }

    private void initUI(){
        setTitle("Dialog GUI");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new MembuatDialogGUI();
            }
            
        });
    }
}
