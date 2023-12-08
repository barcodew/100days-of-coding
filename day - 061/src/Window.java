import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Window extends JFrame {
    Window() {
        setTitle("JComboBox");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.green);
        setVisible(true);
        setLayout(null);

        // Combo Box
        JComboBox<String> listMenu = new JComboBox<>(new String[]  {"MENU 1","MENU 2","MENU 3"});
        listMenu.setSize(200, 50);
        add(listMenu);
    }

    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(() -> {
             try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (UnsupportedLookAndFeelException ignored) {
                Toolkit.getDefaultToolkit().beep();
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                ex.printStackTrace();
                return;
            }
            new Window();
        });
    }
}
