import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int sisi = input.nextInt();
        if (sisi > 0) {

            for (int i = 0; i < sisi; i++) {

                // pola space
                for (int j = 0; j < (sisi - i - 1); j++) {
                    System.out.print("    ");
                }
                // pola +---+
                System.out.print("+");
                for (int j = 0; j <= i; j++) {
                    System.out.print("---+");
                }
                System.out.println();
                // pola space
                for (int j = 0; j < (sisi - i - 1); j++) {
                    System.out.print("    ");
                }
                // pola | |
                System.out.print("|");
                for (int j = 0; j <= i; j++) {
                    System.out.print("   |");
                }
                System.out.println();

            }
            System.out.print("+");
            for (int j = 0; j < sisi; j++) {
                System.out.print("---+");
            }
            System.out.println();

        }
    }
}
