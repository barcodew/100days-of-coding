import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DecimalToBinerGUI extends JFrame {

    CButton convertBtn;
    CTextField inputDecimal;
    CTextField resultBox;
    JDialog showDialog;

    DecimalToBinerGUI() {
        initUI();

        inputDecimal = new CTextField();
        inputDecimal.setBounds(10, 50, 150, 50);

        convertBtn = new CButton();
        convertBtn.setText("CONVERT");
        convertBtn.setBounds(170, 50, 150, 50);
        convertBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                int decimal;
                try {
                    decimal = Integer.parseInt(inputDecimal.getText());

                        String hasil = convertBiner(decimal);
                        resultBox.setText(hasil);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(showDialog, "Masukkan Angka Dengan Benar!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

        });

        resultBox = new CTextField();
        resultBox.setBounds(330, 50, 150, 50);

        add(resultBox);

        add(convertBtn);
        add(inputDecimal);

    }

    private void initUI() {
        setTitle("Decimal To Biner");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(Color.decode("#39A7FF"));
        setVisible(true);
    }

    static String convertBiner(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.insert(0, n % 2);
            n /= 2;
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new DecimalToBinerGUI();
            }

        });
    }
}
