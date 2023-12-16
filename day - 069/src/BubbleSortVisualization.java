import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

public class BubbleSortVisualization extends JFrame {
    private static int LEBAR_BATANG = 50;
    private static JPanel panel;
    private static int[] arrayData = { 232, 125, 156, 323, 43, 155, 67, 88, 93, 90, 144 };

    BubbleSortVisualization() {
        initUI();

        panel = new JPanel() {

            @Override
            public void paint(Graphics g) {
                super.paint(g);
                Menggambar(g);
            }

        };

        add(panel);

        bubbleSort();
    }

    private void Menggambar(Graphics g) {
        int x = 20;
        for (int i = 0; i < arrayData.length; i++) {
            g.setColor(Color.decode("#0ea5e9"));
            g.fillRect(x, getHeight()-200-arrayData[i], LEBAR_BATANG, arrayData[i]);
            g.setColor(Color.BLACK);
            g.drawString(String.valueOf(arrayData[i]), x+15, getHeight()-220);
            g.drawString(String.valueOf(i), x+15, getHeight()-180);
            x += LEBAR_BATANG + 5;
        }
    }

    static void bubbleSort() {
        new Thread(() -> {
            int n = arrayData.length;

            for (int i = 0; i < n - 1; i++) {

                for (int j = 0; j < n - i - 1; j++) {
                    if (arrayData[j] > arrayData[j + 1]) {
                        int temp = arrayData[j];
                        arrayData[j] = arrayData[j + 1];
                        arrayData[j + 1] = temp;
                    }
                    try {
                        Thread.sleep(12000/60);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    panel.repaint();
                }
            }
        }).start();
    }

    private void initUI() {
        setTitle("Bubble Sort Visualization");
        setSize(700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new BubbleSortVisualization();
            }

        });
    }
}
