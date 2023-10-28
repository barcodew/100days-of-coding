import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        String kalimat;
        while (true) {
            System.out.println("Masukkan Kalimat : ");
            kalimat = input.nextLine();

            String[] pemisah = kalimat.split(" ");
            int panjangKalimat = 0;
            String simpan = null;
            for (int i = 0; i < pemisah.length; i++) {
                if (pemisah[i].length() > panjangKalimat) {
                    simpan = pemisah[i];
                    panjangKalimat = pemisah[i].length();
                }

            }
            System.out.println("Kalimat Terpanjang : " + simpan);
            System.out.println("Panjang Kalimat : " + panjangKalimat);

            System.out.println("Lanjut? (Y/n)");
            String tanya = input.next();
            if (tanya.toLowerCase().contains("n")) {
                break;

            }
            input.nextLine();
        }

    }
}
