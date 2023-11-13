import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int baris = input.nextInt();

            if (baris == 0) {
                break;
            }

            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < baris - i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("/");
                for (int j = 0; j < 2 * i; j++) {
                    System.out.print(" ");
                }
                System.out.println("\\");
            }
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("\\");
                for (int j = 0; j < 2 * (baris - i - 1); j++) {
                    System.out.print(" ");
                }
                System.out.println("/");
            }
        }
        System.out.println("Program Selesai!, have a nice day!");
    }
}
