import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class CaraMembuatTextField extends JFrame {
    CaraMembuatTextField() {
        setTitle("Cara Membuat TextField");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(Color.decode("#5FBDFF"));
        setVisible(true);

        JLabel label = new JLabel("Username : ");
        label.setBounds(200, 300, 100, 50);
        label.setFont(new Font("Poppins", Font.PLAIN, 16));
        add(label);
        JTextField textfield = new JTextField();
        textfield.setSize(200, 50);
        textfield.setBounds(300, 300, 200, 50);
        textfield.setFont(new Font("Poppins", Font.PLAIN, 16));
        add(textfield);
        JLabel label2 = new JLabel("Password : ");
        label2.setBounds(200, 350, 100, 50);
        label2.setFont(new Font("Poppins", Font.PLAIN, 16));
        add(label2);
        JTextField textfield2 = new JTextField();
        textfield2.setSize(200, 50);
        textfield2.setBounds(300, 350, 200, 50);
        textfield2.setFont(new Font("Poppins", Font.PLAIN, 16));
        add(textfield2);

        JButton tombol = new JButton("LOGIN");
        tombol.setBounds(300, 450, 200, 50);
        add(tombol);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException ignored) {
            Toolkit.getDefaultToolkit().beep();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            ex.printStackTrace();
            return;
        }
        new CaraMembuatTextField();
    }
}
