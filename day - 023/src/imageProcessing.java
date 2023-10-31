import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;

import javax.imageio.ImageIO;

public class imageProcessing {
    public static void main(String[] args) {
        imageProcessing ip = new imageProcessing();
        String namaFile = "C:\\Users\\barco\\Downloads\\394187_github_icon.png";
        int[][][] dataGambar = ip.bacaGambar(namaFile);
        int[][] dataGray = ip.bacaGray(dataGambar);

        for (int i = 0; i < dataGray.length; i++) {
            System.out.println(Arrays.toString(dataGray[i]));
        }
    }

    private int[][][] bacaGambar(String namaFile) {
        int[][][] dataGambar = null;
        try {
            File file = new File(namaFile);
            BufferedImage gambar = ImageIO.read(file);
            int lebar = gambar.getWidth();
            int panjang = gambar.getHeight();

            dataGambar = new int[lebar][panjang][3];
            for (int i = 0; i < lebar; i++) {
                for (int j = 0; j < panjang; j++) {
                    int warna = gambar.getRGB(i, j);
                    int red = (warna & 0x00ff0000) >> 16;
                    int green = (warna & 0x0000ff00) >> 8;
                    int blue = (warna & 0x000000ff);
                    dataGambar[i][j][0] = red;
                    dataGambar[i][j][1] = green;
                    dataGambar[i][j][2] = blue;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return dataGambar;
    }

    private int[][] bacaGray(int[][][] dataRGB) {
        int[][] dataGray = null;
        try {
            dataGray = new int[dataRGB.length][dataRGB[0].length];

            for (int i = 0; i < dataGray.length; i++) {
                for (int j = 0; j < dataGray[i].length; j++) {
                    int red = dataRGB[i][j][0];
                    int green = dataRGB[i][j][1];
                    int blue = dataRGB[i][j][2];

                    double gray = (double) (red + green + blue) / 3.0;
                    dataGray[i][j] = (int) Math.round(gray);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return dataGray;
    }
}
