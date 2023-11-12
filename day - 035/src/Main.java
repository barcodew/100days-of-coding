import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris = input.nextInt();
        int kolom = input.nextInt();

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("/\\");
            }
            System.out.println();
            for (int j = 0; j < kolom; j++) {
                System.out.print("\\/");
            }
            System.out.println();
        }
    }
}
