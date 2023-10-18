import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Masukkan Nilai n : ");
            n = input.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println("INFORMATIKA");
            } 

            System.out.println("Lanjut bang? (y/n) :");
            String ulang = input.next();
            if (ulang.toLowerCase().contains("n")) {
                break;
            }
        }
        System.out.println("Program Selesai, Have a nice day ^_^");
    }
}
