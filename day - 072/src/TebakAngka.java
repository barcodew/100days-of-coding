import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean start = true;
        int angkaTebak = 5;
        while (start) {
            System.out.println("Masukkan Angka : ");
            int n = input.nextInt();

            if (n > angkaTebak) {
                System.out.println("Tebakan Mu Salah! Masukkan Angka Lebih Kecil!");
            } else if (n < angkaTebak) {
                System.out.println("Tebakan Mu Salah! Masukkan Angka Lebih Besar!");
            }else{
                System.out.println("Tebakanmu Benar!");
                input.nextLine();
                System.out.print("Lanjut ? (Y/n) : ");
                String lanjut = input.nextLine();
                if (lanjut.equals("n")) {
                    start = false;
                }
            }

        }
        input.close();

    }
}
