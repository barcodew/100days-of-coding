import java.util.Scanner;

public class BilanganPrima {

    private static void printBilanganPrima(int awal, int akhir) {

        System.out.println("Bilangan prima dari "+awal+" dan "+ akhir+" : ");
        System.out.print("{");
        for (int i = awal; i <=akhir; i++) {
            if (cekBilangan(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.print("}");
    }
    private static boolean cekBilangan(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int nilaiAwal = input.nextInt();
        int nilaiAkhir = input.nextInt();

        printBilanganPrima(nilaiAwal, nilaiAkhir);
        input.close();

    }
}
