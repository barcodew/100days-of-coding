import java.math.BigInteger;
import java.util.Scanner;

public class operasiBigInteger {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat besar pertama: ");
        String input1 = scanner.nextLine();

        System.out.print("Masukkan bilangan bulat besar kedua: ");
        String input2 = scanner.nextLine();

        BigInteger bilangan1 = new BigInteger(input1);
        BigInteger bilangan2 = new BigInteger(input2);

        BigInteger jumlah = bilangan1.add(bilangan2);
        BigInteger selisih = bilangan1.subtract(bilangan2);
        BigInteger kali = bilangan1.multiply(bilangan2);

        BigInteger bagi = BigInteger.ZERO;
        if (!bilangan2.equals(BigInteger.ZERO)) {
            bagi = bilangan1.divide(bilangan2);
        } else {
            System.out.println("Pembagian oleh nol tidak dapat dilakukan.");
        }

        System.out.println("Hasil penjumlahan: " + jumlah);
        System.out.println("Hasil pengurangan: " + selisih);
        System.out.println("Hasil perkalian: " + kali);
        System.out.println("Hasil pembagian: " + bagi);

        scanner.close();
    }
}
