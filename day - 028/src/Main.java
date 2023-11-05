public class Main {
    public static void main(String[] args) {
        int sisi = 10;

        if (sisi > 0) {

            for (int i = 0; i < sisi; i++) {

                System.out.print("+");
                for (int j = 0; j <= i; j++) {
                    System.out.print("---+");
                }
                System.out.println();

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
