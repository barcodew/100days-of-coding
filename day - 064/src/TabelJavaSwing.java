import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

public class TabelJavaSwing extends JFrame {
    JTable table;

    TabelJavaSwing(){
        initUI();

        String[] head = {"Nama","Belakang","Usia"};

        Object[][] data = {
            {"Ahmad","Ali",20},
            {"Siapa","Akbar",30},
            {"Budi","Ono",10},
        };


        table = new JTable(data,head);

        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane);
    }


    private void initUI(){
        setTitle("Tabel GUI JAVA");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().setBackground(Color.cyan);
        setLayout(new BorderLayout());
    }


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
               new TabelJavaSwing();
            }
            
        });
    }
 
}
