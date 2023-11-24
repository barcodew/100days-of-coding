import java.util.Scanner;

public class Main {

    static void menu() {
        System.out.println("-------------------------------");
        System.out.println("[1] Persegi ");
        System.out.println("[2] Persegi Panjang ");
        System.out.println("[3] Segitiga ");
        System.out.println("[4] Trapesium ");
        System.out.println("[5] Lingkaran ");
        System.out.println("[6] Layang-layang ");
        System.out.println("[7] Jajar Genjang ");
        System.out.println("[8] Belah Ketupat ");
        System.out.println("[0] Exit ");
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int selectedMenu;
        boolean status = true;

        while (status) {
            menu();
            selectedMenu = input.nextInt();

            switch (selectedMenu) {
                case 1:
                    System.out.println("===============");
                    System.out.println("=== Persegi ==");
                    System.out.println("===============");
                    System.out.println("Masukkan Sisi : ");
                    double sisi = input.nextDouble();
                    Persegi kotak = new Persegi(sisi);
                    kotak.hitungKeliling();
                    kotak.hitungLuas();
                    System.out.println("Luas Dari Persegi  : " + kotak.getLuas());
                    System.out.println("keliling Dari Persegi   : " + kotak.getKeliling());
                    break;
                case 2:
                    System.out.println("===============");
                    System.out.println("=== Persegi Panjang ==");
                    System.out.println("===============");
                    System.out.println("Masukkan panjang : ");
                    double panjang = input.nextDouble();
                    System.out.println("Masukkan lebar : ");
                    double lebar = input.nextDouble();
                    PersegiPanjang persegipanjang = new PersegiPanjang(panjang, lebar);
                    persegipanjang.hitungKeliling();
                    persegipanjang.hitungLuas();
                    System.out.println("Luas Dari Persegi Panjang : "  + persegipanjang.getLuas());
                    System.out.println("keliling Dari Persegi Panjang : " + persegipanjang.getKeliling());
                    break;
                case 3:
                    System.out.println("===============");
                    System.out.println("=== Segitiga ==");
                    System.out.println("===============");
                    System.out.println("Masukkan Alas : ");
                    double alas = input.nextDouble();
                    System.out.println("Masukkan Tinggi : ");
                    double tinggi = input.nextDouble();
                    System.out.println("Masukkan Sisi : ");
                    double sisiSegitiga = input.nextDouble();
                    Segitiga segitiga = new Segitiga(alas, tinggi, sisiSegitiga);
                    segitiga.hitungKeliling();
                    segitiga.hitungLuas();
                    System.out.println("Luas Dari segitiga : "  + segitiga.getLuas());
                    System.out.println("keliling Dari segitiga   : " + segitiga.getKeliling());
                    break;
                case 4:
                    System.out.println("===============");
                    System.out.println("=== Trapesium ==");
                    System.out.println("===============");
                    System.out.println("Masukkan Sisi AB: ");
                    double sisiABtrp = input.nextDouble();
                    System.out.println("Masukkan Sisi BC: ");
                    double sisiBCtrp = input.nextDouble();
                    System.out.println("Masukkan Sisi CD: ");
                    double sisiCDtrp = input.nextDouble();
                    System.out.println("Masukkan Sisi DA: ");
                    double sisiDAtrp = input.nextDouble();
                    System.out.println("Masukkan Tinggi: ");
                    double tinggiTrp = input.nextDouble();
                    Trapesium trp = new Trapesium(sisiABtrp, sisiBCtrp, sisiCDtrp, sisiDAtrp, tinggiTrp);
                    trp.hitungKeliling();
                    trp.hitungLuas();
                    System.out.println("Luas Dari Trapesium " + " : " + trp.getLuas());
                    System.out.println("keliling Dari Trapesium   : " + trp.getKeliling());
                    break;
                case 5:
                    System.out.println("===============");
                    System.out.println("=== Lingkaran ==");
                    System.out.println("===============");
                    System.out.println("Masukkan Jari Jari: ");
                    double jarijari = input.nextDouble();
                    Lingkaran lkr = new Lingkaran(jarijari);
                    lkr.hitungKeliling();
                    lkr.hitungLuas();
                    System.out.println("Luas Dari Lingkaran  " + " : " + lkr.getLuas());
                    System.out.println("keliling Dari Lingkaran   : " + lkr.getKeliling());
                    break;
                case 6:
                    System.out.println("===============");
                    System.out.println("=== Layang - Layang ==");
                    System.out.println("===============");
                    System.out.println("Masukkan Diagonal 1: ");
                    double diagonal1 = input.nextDouble();
                    System.out.println("Masukkan Diagonal 2: ");
                    double diagonal2 = input.nextDouble();
                    System.out.println("Masukkan Sisi AB: ");
                    double sisiABlyn = input.nextDouble();
                    System.out.println("Masukkan Sisi BC: ");
                    double sisiBClyn = input.nextDouble();
                    System.out.println("Masukkan Sisi CD: ");
                    double sisiCDlyn = input.nextDouble();
                    System.out.println("Masukkan Sisi DA: ");
                    double sisiDAlyn = input.nextDouble();
                    LayangLayang layang = new LayangLayang(diagonal1, diagonal2, sisiABlyn, sisiBClyn, sisiCDlyn,
                            sisiDAlyn);
                    layang.hitungKeliling();
                    layang.hitungLuas();
                    System.out.println("Luas Dari Layang Layang : " + layang.getLuas());
                    System.out.println("keliling Dari Layang Layang  : " + layang.getKeliling());
                    break;
                case 7:
                    System.out.println("===============");
                    System.out.println("=== Jajar Genjang ==");
                    System.out.println("===============");
                    System.out.println("Masukkan Alas: ");
                    double alasJ = input.nextDouble();
                    System.out.println("Masukkan Tinggi : ");
                    double tinggiJ = input.nextDouble();
                    System.out.println("Masukkan Sisi Miring: ");
                    double sisimiring = input.nextDouble();

                    JajarGenjang jajar = new JajarGenjang(alasJ, tinggiJ, sisimiring);

                    jajar.hitungKeliling();
                    jajar.hitungLuas();
                    System.out.println("Luas Dari jajar Genjang :  " + jajar.getLuas());
                    System.out.println("keliling Dari jajar Genjang   : " + jajar.getKeliling());
                    break;
                case 8:
                    System.out.println("===============");
                    System.out.println("=== Jajar Genjang ==");
                    System.out.println("===============");
                    System.out.println("Masukkan Diagonal 1: ");
                    double diagonal1KTP = input.nextDouble();
                    System.out.println("Masukkan Diagonal 2 : ");
                    double diagonal2KTP = input.nextDouble();
                    System.out.println("Masukkan Sisi : ");
                    double sisiKTP = input.nextDouble();
                    BelahKetupat ketupad = new BelahKetupat(diagonal1KTP, diagonal2KTP, sisiKTP);
                    ketupad.hitungKeliling();
                    ketupad.hitungLuas();
                    System.out.println("Luas Dari Belah Ketupat : " + ketupad.getLuas());
                    System.out.println("keliling Dari Belah Ketupat   : " + ketupad.getKeliling());
                    break;
                case 0:
                    status = false;
                    break;

                default:
                    System.out.println("Pilih Menu Dengan Benar!");

            }
        }
        System.out.println("Program Telah Selesai , have a nice day!");

        input.close();

    }
}
