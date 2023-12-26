import java.util.Scanner;

public class HurufVokal {

    private static String hitungVokal(String kalimat) {
        int totalVokal = 0;

        for (int i = 0; i < kalimat.length(); i++) {
            char temp = kalimat.charAt(i);
            if (temp == 'a' || temp == 'i' || temp == 'u' || temp == 'e' || temp == 'o') {
                totalVokal++;
            }
        }

        if (totalVokal > 0) {
            return "Total Huruf Vokal : " + String.valueOf(totalVokal);
        } else {
            return "Huruf Vokal Tidak Ditemukan";
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        while (true) {
            String kalimat = input.nextLine();
            String hasil = hitungVokal(kalimat.toLowerCase());
            System.out.println(hasil);
            System.out.println();
            if (kalimat.equalsIgnoreCase("EXIT")) {
                break;
            }
        }
    }
}
