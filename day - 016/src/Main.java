import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
     public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("D:\\Learning\\Java\\Praktikum\\Praktikum_2\\src\\Nomer_11\\download.csv"); // change your file location
            BufferedReader br = new BufferedReader(fr);

            String fh = br.readLine();
            String[] header = fh.split(";"); // ganti pemisah sesuai yang ada di filemu

            System.out.printf("%-15s%-50s%-10s%-10s%n", header[0], header[1], header[2], header[3]); // ini header

            String temp;
            while ((temp = br.readLine()) != null) {
                String[] dataCSV = temp.split(";");
                System.out.printf("%-15s%-50s%-10s%-10s%n", dataCSV[0], dataCSV[1], dataCSV[2], dataCSV[3]); // ini isi

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
