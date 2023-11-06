import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris = input.nextInt();

        System.out.print("+");
        for (int j = 0; j < baris; j++) {
            System.out.print("---+");
        }
        for (int i = 0; i < baris; i++) {
            System.out.println();
            System.out.print("|");
            for (int j = 0; j < (baris - i); j++) {
                System.out.print("   |");
            }
            System.out.println();
            System.out.print("+");
            for (int j = 0; j < (baris - i); j++) {
                System.out.print("---+");
            }
        }
    }
}
