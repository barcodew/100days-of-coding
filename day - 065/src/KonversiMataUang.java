import java.text.DecimalFormat;
import java.util.Scanner;

public class KonversiMataUang {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        boolean statusProgram = true;
        double uang, result;

        while (statusProgram) {
            System.out.println("-------------------");
            System.out.println("[1] Rupiah ");
            System.out.println("[2] USD ");
            System.out.println("[0] Exit ");
            System.out.println("-------------------");

            int selectMenu = input.nextInt();

            switch (selectMenu) {
                case 1:
                    System.out.println("Masukkan Jumlah Uang  (RP) :");
                    uang = input.nextDouble();
                    result = uang / 15_500;
                    System.out.println("$ " + df.format(result));
                    break;
                case 2:
                    System.out.println("Masukkan Jumlah Uang  ($) :");
                    uang = input.nextDouble();
                    result = uang * 15_500;
                    System.out.println("Rp " + df.format(result));
                    break;
                case 0:
                    statusProgram = false;
                    break;

                default:
                    System.out.println("Pilih Menu Dengan Benar!");
                    break;
            }

        }
        System.out.println("Program Selesai!, have a nice day.");

    }
}
