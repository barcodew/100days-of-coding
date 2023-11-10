import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sisi = input.nextInt();

        System.out.print("+");
        for (int i = 0; i < sisi; i++) {
            System.out.print("---+");
        }
        System.out.println();
        for (int i = 0; i < sisi; i++) {
            System.out.print("|");
            for (int j = 0; j < sisi - 1; j++) {
                System.out.print("    ");
            }
            System.out.println("   |");
            if (i < sisi - 1) {
                System.out.print("+");
                for (int j = 0; j < sisi - 1; j++) {
                    System.out.print("    ");
                }
                System.out.println("   +");
            }
        }
        System.out.print("+");
        for (int i = 0; i < sisi; i++) {
            System.out.print("---+");
        }
    }
}
