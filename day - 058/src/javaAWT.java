import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

public class javaAWT {
    public static void main(String[] args) {
            Frame window = new Frame();

            window.setLocationRelativeTo(null);
            window.setTitle("ini Java AWT");
            window.setSize(500,500);
            window.setVisible(true);
            window.setLayout(null);
            window.setBackground(Color.decode("#3b82f6"));

            // ini label 

            Label labelAWT = new Label("INI LABEL DARI JAVA AWT");
            labelAWT.setBounds(200, 200, 200,200);
            window.add(labelAWT);

    }
}
