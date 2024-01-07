import java.util.Scanner;

public class WaktuYangDapatDibacaManusia {

    private static String makeReadable(int detik) {

        if (detik < 0 || detik > 359999) {
            return "Invalid Input!";
        }

        int jam = detik / 3600;
        int sisaDetik = detik % 3600;
        int menit = sisaDetik / 60;
        int detikSisa = sisaDetik % 60;

        String hasilWaktu = String.format("%02d:%02d:%02d",jam,menit,detikSisa);

        return hasilWaktu;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int detik = input.nextInt();

        System.out.println(makeReadable(detik));

    }
}
