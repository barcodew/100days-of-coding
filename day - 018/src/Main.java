
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<String, String> dataMHS = new HashMap<>();

        while (true) {

            System.out.print("NIM : ");
            String nim = input.nextLine();
            System.out.print("Nama : ");
            String nama = input.nextLine();

            if (dataMHS.containsKey(nim)) {
                System.out.println("Data Sudah Terdaftar!");
            } else {
                dataMHS.put(nim, nama);
                System.out.println("Data Berhasil Didaftarkan!");
            }

            System.out.println("Lanjut? Y/n ");
            String lanjut = input.next();
            if (lanjut.toLowerCase().contains("n")) {
                break;
            }
            input.nextLine();

        }
        System.out.println(dataMHS);
        System.out.println("Program Selesai! Have a nice day.");

        input.close();
    }
}
