import java.util.Scanner;

public class Main {

    // ngitung harga
    public static int totalHarga(int jumlahPesanan, int harga) {

        return jumlahPesanan * harga;
    }

    // pencetak harga
    public static void cetak(String namaBarang, int jumlahPesanan, int harga) {
        System.out.println("Pesanan Anda :");
        System.out.println("Jenis : " + namaBarang);
        System.out.println("Jumlah : " + jumlahPesanan);
        System.out.println("Total harga : " + totalHarga(jumlahPesanan, harga));
    }

    static void menu() {
        System.out.println("---------------------------");
        System.out.println("-------- INI MENU ---------");
        System.out.println("---------------------------");
        System.out.println("1. ES TEH PANAS : Rp 10.000");
        System.out.println("2. KOPI HITAM \t: Rp 15.000 ");
        System.out.println("3. KOPI SUSU \t: Rp 20.000 ");
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        menu();
        int selectMenu = input.nextInt();
        while (true) {

            int jumlahPesanan;
            if (selectMenu == 1) {
                System.out.println("Mau Pesan Berapa? ");
                jumlahPesanan = input.nextInt();
                cetak("ES TEH PANAS", jumlahPesanan, 10000);
            } else if (selectMenu == 2) {
                System.out.println("Mau Pesan Berapa? ");
                jumlahPesanan = input.nextInt();
                cetak("KOPI HITAM", jumlahPesanan, 15000);
            } else if (selectMenu == 3) {
                System.out.println("Mau Pesan Berapa? ");
                jumlahPesanan = input.nextInt();
                cetak("KOPI SUSU", jumlahPesanan, 20000);
            } else {
                System.out.println("PILIH MENU YANG BETUL!");
            }
            System.out.println("Ingin memesan yang lain? (Y/n) :");
            String lanjut = input.next();
            if (lanjut.toLowerCase().contains("n")) {
                break;
            }

            menu();
            selectMenu = input.nextInt();

        }
        System.out.println("PROGRAM SELESAI! , HAVE A NICE DAY!");

    }
}
