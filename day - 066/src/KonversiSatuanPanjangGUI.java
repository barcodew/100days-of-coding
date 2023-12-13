import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KonversiSatuanPanjangGUI extends JFrame{
    JTextField input;
    JTextField output;
    JLabel inputLabel;
    JLabel outputLabel;
    JButton button;

    KonversiSatuanPanjangGUI(){
        initUI();

        inputLabel = new JLabel("KM");
        input = new JTextField(10);
        button = new JButton("CONVERT");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double value = Double.parseDouble(input.getText());
                double result = value*100000;

                output.setText(String.valueOf(result));
            }
            
        });
        outputLabel = new JLabel("CM");
        output = new JTextField(10);

        add(inputLabel);
        add(input);
        add(button);
        add(outputLabel);
        add(output);


    }

    private void initUI(){
        setTitle("Konversi Satuan Panjang");
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.decode("#5FBDFF"));
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new KonversiSatuanPanjangGUI();
            }
            
        });
    }
}
