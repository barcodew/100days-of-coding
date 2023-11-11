public class Main {
    public static void main(String[] args) {

        int baris = 3;
        int kolom = 4;

        System.out.print("+");
        for (int i = 0; i < kolom; i++) {
            System.out.print("---+");
        }
        System.out.println();
        for (int i = 0; i < baris; i++) {
            System.out.print("|");
            for (int j = 0; j < kolom - 1; j++) {
                System.out.print("    ");
            }
            System.out.println("   |");
            if (i < baris - 1) {

                System.out.print("+");
                for (int j = 0; j < kolom - 1; j++) {
                    System.out.print("    ");
                }
                System.out.println("   +");
            }
        }
        System.out.print("+");
        for (int i = 0; i < kolom; i++) {
            System.out.print("---+");
        }
    }
}
