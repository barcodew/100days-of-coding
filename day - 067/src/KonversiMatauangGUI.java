import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class KonversiMatauangGUI extends JFrame {
    JTextField input;
    JTextField output;
    JLabel labelInput;
    JLabel labeloutput;
    JButton btn;
    KonversiMatauangGUI() {
        initUI();


        labelInput = new JLabel("RP");
        input = new JTextField(15);
        labeloutput = new JLabel("$");
        output = new JTextField(15);

        btn = new JButton("CONVERT");

        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double value = Double.parseDouble(input.getText());

                double result = value/15000;

                output.setText(String.valueOf(result));
            }
            
        });


        add(labelInput);
        add(input);
        add(btn);
        add(labeloutput);
        add(output);

    }

    private void initUI() {
        setTitle("Konversi Uang");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new KonversiMatauangGUI();
            }
            
        });
    }
}
